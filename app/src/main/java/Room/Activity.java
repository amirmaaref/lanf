package Room;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.arch.persistence.room.PrimaryKey;

/**
 * Created by amirhossein on 2/8/18.
 */

@Entity
public class Activity {
    @PrimaryKey(autoGenerate = true)
    private int id;

    @ColumnInfo(name = "avtivity_type")
    private String type;

    @ColumnInfo(name = "avtivity_min")
    private String min;

    @ColumnInfo(name = "avtivity_datetime")
    private String date_time;

    @ColumnInfo(name = "avtivity_patientid")
    private String pId;

    public Activity(int id, String type, String min, String date_time, String pId) {
        this.id = id;
        this.type = type;
        this.min = min;
        this.date_time = date_time;
        this.pId = pId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getMin() {
        return min;
    }

    public void setMin(String min) {
        this.min = min;
    }

    public String getDate_time() {
        return date_time;
    }

    public void setDate_time(String date_time) {
        this.date_time = date_time;
    }

    public String getpId() {
        return pId;
    }

    public void setpId(String pId) {
        this.pId = pId;
    }
}