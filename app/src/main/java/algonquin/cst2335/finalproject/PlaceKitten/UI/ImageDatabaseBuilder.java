package algonquin.cst2335.finalproject.PlaceKitten.UI;

import android.database.sqlite.SQLiteDatabase;

public class ImageDatabaseBuilder {
    private PlaceKittenPage placeKittenPage;

    public ImageDatabaseBuilder() {
        
    }

    public ImageDatabaseBuilder setPlaceKittenPage(PlaceKittenPage placeKittenPage) {
        this.placeKittenPage = placeKittenPage;
        return this;
    }

    public ImageDatabaseBuilder createImageDatabaseHelper() {
        return new ImageDatabaseBuilder();
    }

    public SQLiteDatabase getWritableDatabase() {
        return null;
    }
}