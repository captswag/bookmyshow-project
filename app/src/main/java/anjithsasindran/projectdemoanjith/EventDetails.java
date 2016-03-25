package anjithsasindran.projectdemoanjith;

import android.net.Uri;

import java.util.Calendar;
import java.util.List;

import anjithsasindran.projectdemoanjith.helpers.ParseToCalendar;

/**
 * Created by Anjith Sasindran
 * on 20-Mar-16.
 */
public class EventDetails {

    private String eventImageUrl;
    private String eventName;
    private String eventCity;
    private Calendar eventStartCalendar;
    private Calendar eventEndCalendar;
    private String eventFullAddress;
    private Uri latLong;

    public String getEventImageUrl() {
        return eventImageUrl;
    }

    public void setEventImageUrl(String eventImageUrl) {
        this.eventImageUrl = eventImageUrl;
    }

    public String getEventName() {
        return eventName;
    }

    public void setEventName(String eventName) {
        this.eventName = eventName;
    }

    public String getEventCity() {
        return eventCity;
    }

    public void setEventCity(String eventCity) {
        this.eventCity = eventCity;
    }

    public Calendar getEventStartCalendar() {
        return eventStartCalendar;
    }

    public void setEventStartCalendar(String eventStartDate) {
        this.eventStartCalendar = ParseToCalendar.convertStringDateToCalendar(eventStartDate);
    }

    public Calendar getEventEndCalendar() {
        return eventEndCalendar;
    }

    public void setEventEndCalendar(String eventEndDate) {
        this.eventEndCalendar = ParseToCalendar.convertStringDateToCalendar(eventEndDate);
    }

    public String getEventFullAddress() {
        return eventFullAddress;
    }

    public void setEventFullAddress(String eventFullAddress) {
        this.eventFullAddress = eventFullAddress;
    }

    public Uri getLatLong() {
        return latLong;
    }

    public void setLatLong(List<Double> latLong) {
        if (latLong.get(0) != null && latLong.get(1) != null)
            this.latLong = Uri.parse("geo:" + latLong.get(1) + "," + latLong.get(0));
    }
}