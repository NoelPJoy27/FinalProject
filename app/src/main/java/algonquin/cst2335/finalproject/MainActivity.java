package algonquin.cst2335.finalproject;


import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject.databinding.ActivityMainBinding;

public class MainActivity extends AppCompatActivity {
    private ActivityMainBinding binding;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding= ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
        navigation();
    }
    void navigation(){

        binding.buttonConnect.setOnClickListener(clk->{
            Intent PlaceKittenPage=new Intent(this, algonquin.cst2335.finalproject.PlaceKitten.UI.PlaceKittenPage.class);
            startActivity(PlaceKittenPage);
        });

        binding.buttonConnect.setOnClickListener(view -> {
            String widthString = binding.editWidth.getText().toString();
            String heightString = binding.editHeight.getText().toString();
            if (!widthString.isEmpty() && !heightString.isEmpty()) {
                int width = Integer.parseInt(widthString);
                int height = Integer.parseInt(heightString);
                String url = "https://placekitten.com/" + width + "/" + height;
                Intent intent = new Intent(Intent.ACTION_VIEW, Uri.parse(url));
                startActivity(intent);
            }
        });


    }


}