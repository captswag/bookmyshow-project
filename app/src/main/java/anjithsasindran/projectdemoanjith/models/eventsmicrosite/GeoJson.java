
package anjithsasindran.projectdemoanjith.models.eventsmicrosite;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class GeoJson {

    @SerializedName("coordinates")
    @Expose
    private List<Double> coordinates = new ArrayList<Double>();

    /**
     * @return The coordinates
     */
    public List<Double> getCoordinates() {
        return coordinates;
    }

    /**
     * @param coordinates The coordinates
     */
    public void setCoordinates(List<Double> coordinates) {
        this.coordinates = coordinates;
    }

}
