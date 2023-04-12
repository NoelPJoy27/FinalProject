package algonquin.cst2335.finalproject.PlaceKitten.Data;


import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.AsyncTask;

import com.example.finalproject.databinding.ActivityMainBinding;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

public class DownloadImageTask {

    public void execute(String imageUrl) {
    }

    private class downloadImageTask extends AsyncTask<String, Void, Bitmap> {

        private ActivityMainBinding binding;

        @Override
        protected Bitmap doInBackground(String... urls) {
            String imageUrl = urls[0];
            try {
                InputStream inputStream = new URL(imageUrl).openStream();
                return BitmapFactory.decodeStream(inputStream);
            } catch (IOException e) {
                e.printStackTrace();
            }
            return null;
        }

        @Override
        protected void onPostExecute(Bitmap bitmap) {
            if (bitmap != null) {
                binding.imageView.setImageBitmap(bitmap);
            }
        }
    }
}
