package algonquin.cst2335.finalproject.NewYorkTimes.Data;

import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class NewsData {

    @PrimaryKey(autoGenerate = true)
    @ColumnInfo(name = "id")
    public int id;

    @ColumnInfo(name="headline")
    private String headline;

    @ColumnInfo(name="webUrl")
    private String webUrl;

    @ColumnInfo(name="pubDate")
    private String pubDate;

    public NewsData() {}

    public NewsData(String headline, String webUrl, String pubDate) {
        this.headline = headline;
        this.webUrl = webUrl;
        this.pubDate = pubDate;
    }

    public String getHeadline() {
        return headline;
    }

    public String getWebUrl() {
        return webUrl;
    }

    public String getPubDate() {
        return pubDate;
    }

    public void setHeadline(String headline) {
        this.headline = headline;
    }

    public void setWebUrl(String webUrl) {
        this.webUrl = webUrl;
    }

    public void setPubDate(String pubDate) {
        this.pubDate = pubDate;
    }
}
