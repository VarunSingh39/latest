package in.mahagram.mylibrary;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

/**
 * Created by asdf on 4/28/2018.
 */

public class GetStateListModel {
    @SerializedName("stateid")
    @Expose
    private Integer stateid;
    @SerializedName("statename")
    @Expose
    private String statename;

    public Integer getStateid() {
        return stateid;
    }

    public void setStateid(Integer stateid) {
        this.stateid = stateid;
    }

    public String getStatename() {
        return statename;
    }

    public void setStatename(String statename) {
        this.statename = statename;
    }

}
