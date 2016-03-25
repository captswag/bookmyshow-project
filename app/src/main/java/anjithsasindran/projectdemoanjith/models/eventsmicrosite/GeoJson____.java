
package anjithsasindran.projectdemoanjith.models.eventsmicrosite;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class GeoJson____ {

    @SerializedName("coordinates")
    @Expose
    private List<Integer> coordinates = new ArrayList<Integer>();

    /**
     * @return The coordinates
     */
    public List<Integer> getCoordinates() {
        return coordinates;
    }

    /**
     * @param coordinates The coordinates
     */
    public void setCoordinates(List<Integer> coordinates) {
        this.coordinates = coordinates;
    }

}
