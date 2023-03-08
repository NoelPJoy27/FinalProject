package algonquin.cst2335.thom1586;

import  androidx.activity.result.ActivityResult;
import androidx.activity.result.ActivityResultCallback;
import androidx.activity.result.ActivityResultLauncher;
import androidx.activity.result.contract.ActivityResultContracts;
import androidx.appcompat.app.AppCompatActivity;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.net.Uri;
import android.os.Bundle;
import android.provider.MediaStore;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;

import java.io.File;


public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Button changeNumber = findViewById(R.id.callNumber);
        TextView topText = findViewById(R.id.textView);
        Button picture = findViewById(R.id.changePicture);
        ImageView profilePicture = findViewById(R.id.Image);
        Intent fromPrevious = getIntent();
        String emailAddress = fromPrevious.getStringExtra("Email Address");
        topText.setText("Welcome back " + emailAddress);

        File file = new File( getFilesDir() , "Picture.png");

        if(file.exists())

        {
            Bitmap theImage = BitmapFactory.decodeFile(file.getAbsolutePath());
            profilePicture.setImageBitmap(theImage);
        }

        changeNumber.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText number = findViewById(R.id.editTextPhone);
                String phoneNumber = number.getText().toString();
                Intent c = new Intent(Intent.ACTION_DIAL);
                c.setData(Uri.parse("tel:" + phoneNumber));
                startActivity(c);
            }
        });
        picture.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent cameraIntent = new Intent(MediaStore.ACTION_IMAGE_CAPTURE);
                cameraResult.launch(cameraIntent);
            }
            ActivityResultLauncher<Intent> cameraResult = registerForActivityResult(
                    new ActivityResultContracts.StartActivityForResult(),
                    new ActivityResultCallback<ActivityResult>() {
                        @Override
                        public void onActivityResult(ActivityResult result) {
                            if (result.getResultCode() == Activity.RESULT_OK) {
                                Intent data = result.getData();
                                Bitmap thumbnail = data.getParcelableExtra("data");
                                profilePicture.setImageBitmap(thumbnail);
                            }
                        }
                    });
        });

        changeNumber = findViewById(R.id.callNumber);
        EditText editTextPhone = findViewById(R.id.editTextPhone);
        SharedPreferences prefs = getSharedPreferences("MyPhoneData", Context.MODE_PRIVATE);
        String phoneNumber = prefs.getString("PhoneNumber", "");
        editTextPhone.setText(phoneNumber);
    }
    @Override
    protected void onPause() {
        super.onPause();
        EditText phoneNumber = (EditText) findViewById(R.id.editTextPhone);
        SharedPreferences sharedPreferences = getSharedPreferences("MyPhoneData", Context.MODE_PRIVATE);
        SharedPreferences.Editor edited = sharedPreferences.edit();
        edited.putString("PhoneNumber" , phoneNumber.getText().toString());
        edited.apply();
    }




}