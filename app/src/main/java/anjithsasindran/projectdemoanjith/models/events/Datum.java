
package anjithsasindran.projectdemoanjith.models.events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class Datum {

    @SerializedName("_id")
    @Expose
    private String Id;
    @SerializedName("banner")
    @Expose
    private Banner banner;
    @SerializedName("config")
    @Expose
    private Object config;
    @SerializedName("end_date")
    @Expose
    private String endDate;
    @SerializedName("location")
    @Expose
    private Location location;
    @SerializedName("name")
    @Expose
    private String name;
    @SerializedName("permalink")
    @Expose
    private String permalink;
    @SerializedName("publish_status")
    @Expose
    private String publishStatus;
    @SerializedName("section_sequence")
    @Expose
    private List<String> sectionSequence = new ArrayList<String>();
    @SerializedName("start_date")
    @Expose
    private String startDate;
    @SerializedName("tags")
    @Expose
    private List<String> tags = new ArrayList<String>();
    @SerializedName("theme")
    @Expose
    private String theme;
    @SerializedName("type")
    @Expose
    private String type;

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
     * @return The banner
     */
    public Banner getBanner() {
        return banner;
    }

    /**
     * @param banner The banner
     */
    public void setBanner(Banner banner) {
        this.banner = banner;
    }

    /**
     * @return The config
     */
    public Object getConfig() {
        return config;
    }

    /**
     * @param config The config
     */
    public void setConfig(Object config) {
        this.config = config;
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
     * @return The location
     */
    public Location getLocation() {
        return location;
    }

    /**
     * @param location The location
     */
    public void setLocation(Location location) {
        this.location = location;
    }

    /**
     * @return The name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name The name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return The permalink
     */
    public String getPermalink() {
        return permalink;
    }

    /**
     * @param permalink The permalink
     */
    public void setPermalink(String permalink) {
        this.permalink = permalink;
    }

    /**
     * @return The publishStatus
     */
    public String getPublishStatus() {
        return publishStatus;
    }

    /**
     * @param publishStatus The publish_status
     */
    public void setPublishStatus(String publishStatus) {
        this.publishStatus = publishStatus;
    }

    /**
     * @return The sectionSequence
     */
    public List<String> getSectionSequence() {
        return sectionSequence;
    }

    /**
     * @param sectionSequence The section_sequence
     */
    public void setSectionSequence(List<String> sectionSequence) {
        this.sectionSequence = sectionSequence;
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
     * @return The tags
     */
    public List<String> getTags() {
        return tags;
    }

    /**
     * @param tags The tags
     */
    public void setTags(List<String> tags) {
        this.tags = tags;
    }

    /**
     * @return The theme
     */
    public String getTheme() {
        return theme;
    }

    /**
     * @param theme The theme
     */
    public void setTheme(String theme) {
        this.theme = theme;
    }

    /**
     * @return The type
     */
    public String getType() {
        return type;
    }

    /**
     * @param type The type
     */
    public void setType(String type) {
        this.type = type;
    }

}
