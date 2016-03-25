
package anjithsasindran.projectdemoanjith.models.events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class EventsModel {

    @SerializedName("data")
    @Expose
    private List<Datum> data = new ArrayList<Datum>();
    @SerializedName("error")
    @Expose
    private String error;
    @SerializedName("status")
    @Expose
    private int status;

    /**
     * @return The data
     */
    public List<Datum> getData() {
        return data;
    }

    /**
     * @param data The data
     */
    public void setData(List<Datum> data) {
        this.data = data;
    }

    /**
     * @return The error
     */
    public String getError() {
        return error;
    }

    /**
     * @param error The error
     */
    public void setError(String error) {
        this.error = error;
    }

    /**
     * @return The status
     */
    public int getStatus() {
        return status;
    }

    /**
     * @param status The status
     */
    public void setStatus(int status) {
        this.status = status;
    }

}
