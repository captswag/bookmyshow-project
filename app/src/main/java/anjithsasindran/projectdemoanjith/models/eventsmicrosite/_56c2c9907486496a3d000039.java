
package anjithsasindran.projectdemoanjith.models.eventsmicrosite;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class _56c2c9907486496a3d000039 {

    @SerializedName("event_id")
    @Expose
    private String eventId;
    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("entity_type")
    @Expose
    private String entityType;
    @SerializedName("_id")
    @Expose
    private String Id;
    @SerializedName("duration")
    @Expose
    private int duration;
    @SerializedName("tags")
    @Expose
    private List<String> tags = new ArrayList<String>();
    @SerializedName("starting_at")
    @Expose
    private String startingAt;
    @SerializedName("ending_at")
    @Expose
    private String endingAt;
    @SerializedName("associated_people")
    @Expose
    private List<AssociatedPerson__> associatedPeople = new ArrayList<AssociatedPerson__>();

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
     * @return The entityType
     */
    public String getEntityType() {
        return entityType;
    }

    /**
     * @param entityType The entity_type
     */
    public void setEntityType(String entityType) {
        this.entityType = entityType;
    }

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
     * @return The duration
     */
    public int getDuration() {
        return duration;
    }

    /**
     * @param duration The duration
     */
    public void setDuration(int duration) {
        this.duration = duration;
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
     * @return The startingAt
     */
    public String getStartingAt() {
        return startingAt;
    }

    /**
     * @param startingAt The starting_at
     */
    public void setStartingAt(String startingAt) {
        this.startingAt = startingAt;
    }

    /**
     * @return The endingAt
     */
    public String getEndingAt() {
        return endingAt;
    }

    /**
     * @param endingAt The ending_at
     */
    public void setEndingAt(String endingAt) {
        this.endingAt = endingAt;
    }

    /**
     * @return The associatedPeople
     */
    public List<AssociatedPerson__> getAssociatedPeople() {
        return associatedPeople;
    }

    /**
     * @param associatedPeople The associated_people
     */
    public void setAssociatedPeople(List<AssociatedPerson__> associatedPeople) {
        this.associatedPeople = associatedPeople;
    }

}
