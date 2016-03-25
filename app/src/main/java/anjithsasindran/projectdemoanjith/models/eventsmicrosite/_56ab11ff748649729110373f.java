
package anjithsasindran.projectdemoanjith.models.eventsmicrosite;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

public class _56ab11ff748649729110373f {

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
    @SerializedName("first_name")
    @Expose
    private String firstName;
    @SerializedName("last_name")
    @Expose
    private String lastName;
    @SerializedName("salutation")
    @Expose
    private String salutation;
    @SerializedName("email")
    @Expose
    private String email;
    @SerializedName("organization")
    @Expose
    private String organization;
    @SerializedName("image")
    @Expose
    private Image__ image;
    @SerializedName("social_links")
    @Expose
    private List<SocialLink> socialLinks = new ArrayList<SocialLink>();

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
     * @return The firstName
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * @param firstName The first_name
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /**
     * @return The lastName
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * @param lastName The last_name
     */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /**
     * @return The salutation
     */
    public String getSalutation() {
        return salutation;
    }

    /**
     * @param salutation The salutation
     */
    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    /**
     * @return The email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email The email
     */
    public void setEmail(String email) {
        this.email = email;
    }

    /**
     * @return The organization
     */
    public String getOrganization() {
        return organization;
    }

    /**
     * @param organization The organization
     */
    public void setOrganization(String organization) {
        this.organization = organization;
    }

    /**
     * @return The image
     */
    public Image__ getImage() {
        return image;
    }

    /**
     * @param image The image
     */
    public void setImage(Image__ image) {
        this.image = image;
    }

    /**
     * @return The socialLinks
     */
    public List<SocialLink> getSocialLinks() {
        return socialLinks;
    }

    /**
     * @param socialLinks The social_links
     */
    public void setSocialLinks(List<SocialLink> socialLinks) {
        this.socialLinks = socialLinks;
    }

}
