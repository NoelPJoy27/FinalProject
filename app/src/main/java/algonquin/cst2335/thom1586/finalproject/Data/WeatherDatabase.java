package algonquin.cst2335.thom1586.finalproject.Data;
import androidx.room.Database;
import androidx.room.RoomDatabase;

/**
 * This class represent the database of WeatherStack
 * @author Sathal Binila Thomas
 * @version 01
 */
@Database(entities = {WeatherItem.class}, version = 1)
public abstract class WeatherDatabase extends RoomDatabase {
    public abstract WeatherItemDAO cmDAO();
}
