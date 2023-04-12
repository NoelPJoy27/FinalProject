package algonquin.cst2335.finalproject.PlaceKitten.UI;

import android.content.ContentValues;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.finalproject.R;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.text.DateFormat;
import java.util.Date;

import ImageContract.ImageEntry;

public class PlaceKittenPage extends AppCompatActivity {

    private Object imageBitmap;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_place_kitten_page);
    }
    private void saveImageToFavorites() {
        if (imageBitmap != null) {

            int width = (int)imageBitmap;
            int height = (int) imageBitmap;
            String timestamp = DateFormat.getDateTimeInstance().format(new Date());

            // Save the image to disk
            String filename = "image_" + System.currentTimeMillis() + ".jpg";
            File file = new File(getFilesDir(), filename);
            try {
                FileOutputStream fos = new FileOutputStream(file);
                fos.close();
            } catch (IOException e) {
                e.printStackTrace();
            }

            // Save the image metadata to the database
            ImageDatabaseBuilder dbHelper = new ImageDatabaseBuilder().setPlaceKittenPage(this);
            SQLiteDatabase db = dbHelper.getWritableDatabase();
            ContentValues values = new ContentValues();
            values.put(ImageEntry.COLUMN_NAME_FILENAME, filename);
            values.put(ImageEntry.COLUMN_NAME_WIDTH, width);
            values.put(ImageEntry.COLUMN_NAME_HEIGHT, height);
            values.put(ImageEntry.COLUMN_NAME_TIMESTAMP, timestamp);
            db.insert(ImageEntry.TABLE_NAME, null, values);

            Toast.makeText(this, "Image saved to favorites", Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "No image to save", Toast.LENGTH_SHORT).show();
        }
    }


}