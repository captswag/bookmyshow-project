
package anjithsasindran.projectdemoanjith.models.events;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location {

    @SerializedName("building_no")
    @Expose
    private String buildingNo;
    @SerializedName("city")
    @Expose
    private String city;
    @SerializedName("country")
    @Expose
    private String country;
    @SerializedName("full_address")
    @Expose
    private String fullAddress;
    @SerializedName("geo_json")
    @Expose
    private GeoJson geoJson;
    @SerializedName("locality")
    @Expose
    private String locality;
    @SerializedName("pincode")
    @Expose
    private String pincode;
    @SerializedName("road")
    @Expose
    private String road;
    @SerializedName("state")
    @Expose
    private String state;

    /**
     * @return The buildingNo
     */
    public String getBuildingNo() {
        return buildingNo;
    }

    /**
     * @param buildingNo The building_no
     */
    public void setBuildingNo(String buildingNo) {
        this.buildingNo = buildingNo;
    }

    /**
     * @return The city
     */
    public String getCity() {
        return city;
    }

    /**
     * @param city The city
     */
    public void setCity(String city) {
        this.city = city;
    }

    /**
     * @return The country
     */
    public String getCountry() {
        return country;
    }

    /**
     * @param country The country
     */
    public void setCountry(String country) {
        this.country = country;
    }

    /**
     * @return The fullAddress
     */
    public String getFullAddress() {
        return fullAddress;
    }

    /**
     * @param fullAddress The full_address
     */
    public void setFullAddress(String fullAddress) {
        this.fullAddress = fullAddress;
    }

    /**
     * @return The geoJson
     */
    public GeoJson getGeoJson() {
        return geoJson;
    }

    /**
     * @param geoJson The geo_json
     */
    public void setGeoJson(GeoJson geoJson) {
        this.geoJson = geoJson;
    }

    /**
     * @return The locality
     */
    public String getLocality() {
        return locality;
    }

    /**
     * @param locality The locality
     */
    public void setLocality(String locality) {
        this.locality = locality;
    }

    /**
     * @return The pincode
     */
    public String getPincode() {
        return pincode;
    }

    /**
     * @param pincode The pincode
     */
    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    /**
     * @return The road
     */
    public String getRoad() {
        return road;
    }

    /**
     * @param road The road
     */
    public void setRoad(String road) {
        this.road = road;
    }

    /**
     * @return The state
     */
    public String getState() {
        return state;
    }

    /**
     * @param state The state
     */
    public void setState(String state) {
        this.state = state;
    }

}
