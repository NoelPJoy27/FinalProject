package algonquin.cst2335.finalproject.NewYorkTimes.Data;

import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface NewsDataDAO {

    @Insert
    public long insertList(NewsData nd);

    @Query("SELECT * FROM NewsData")
    public List<NewsData> getAllList();

    @Delete
    public void deleteList(NewsData nd);
}
