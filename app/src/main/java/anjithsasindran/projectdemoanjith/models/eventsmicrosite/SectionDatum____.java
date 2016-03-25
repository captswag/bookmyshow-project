
package anjithsasindran.projectdemoanjith.models.eventsmicrosite;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class SectionDatum____ {

    @SerializedName("data_type")
    @Expose
    private String dataType;
    @SerializedName("data_id")
    @Expose
    private String dataId;

    /**
     * @return The dataType
     */
    public String getDataType() {
        return dataType;
    }

    /**
     * @param dataType The data_type
     */
    public void setDataType(String dataType) {
        this.dataType = dataType;
    }

    /**
     * @return The dataId
     */
    public String getDataId() {
        return dataId;
    }

    /**
     * @param dataId The data_id
     */
    public void setDataId(String dataId) {
        this.dataId = dataId;
    }

}
