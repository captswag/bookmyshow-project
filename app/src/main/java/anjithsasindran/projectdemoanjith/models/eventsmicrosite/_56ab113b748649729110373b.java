
package anjithsasindran.projectdemoanjith.models.eventsmicrosite;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class _56ab113b748649729110373b {

    @SerializedName("_id")
    @Expose
    private String Id;
    @SerializedName("event_id")
    @Expose
    private String eventId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("section_type")
    @Expose
    private String sectionType;
    @SerializedName("section_data")
    @Expose
    private List<SectionDatum> sectionData = new ArrayList<SectionDatum>();

    /**
     * @return The Id
     */
    public String getId() {
        return Id;
    }

    /**
     * @param Id The _id
     */
    public void setId(String Id) {
        this.Id = Id;
    }

    /**
     * @return The eventId
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * @param eventId The event_id
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * @return The title
     */
    public String getTitle() {
        return title;
    }

    /**
     * @param title The title
     */
    public void setTitle(String title) {
        this.title = title;
    }

    /**
     * @return The description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description The description
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return The startDate
     */
    public String getStartDate() {
        return startDate;
    }

    /**
     * @param startDate The start_date
     */
    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    /**
     * @return The endDate
     */
    public String getEndDate() {
        return endDate;
    }

    /**
     * @param endDate The end_date
     */
    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    /**
     * @return The sectionType
     */
    public String getSectionType() {
        return sectionType;
    }

    /**
     * @param sectionType The section_type
     */
    public void setSectionType(String sectionType) {
        this.sectionType = sectionType;
    }

    /**
     * @return The sectionData
     */
    public List<SectionDatum> getSectionData() {
        return sectionData;
    }

    /**
     * @param sectionData The section_data
     */
    public void setSectionData(List<SectionDatum> sectionData) {
        this.sectionData = sectionData;
    }

}
