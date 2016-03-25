package anjithsasindran.projectdemoanjith.helpers;

import java.util.ArrayList;
import java.util.List;

import anjithsasindran.projectdemoanjith.EventDetails;
import anjithsasindran.projectdemoanjith.models.events.Datum;

/**
 * Created by Anjith Sasindran
 * on 20-Mar-16.
 * Helper class for creating list of EventDetails, which is passed to EventDetailsAdapter
 */
public class EventsListHelper {

    public static ArrayList<EventDetails> setUpDataForEventsList(List<Datum> eventsModel) {
        ArrayList<EventDetails> eventsList = new ArrayList<>();
        for (Datum eventData : eventsModel) {
            EventDetails eventDetails = new EventDetails();
            eventDetails.setEventImageUrl(eventData.getBanner().getOriginal());
            eventDetails.setEventName(eventData.getName());
            eventDetails.setEventCity(eventData.getLocation().getCity());
            eventDetails.setEventStartCalendar(eventData.getStartDate());
            eventDetails.setEventEndCalendar(eventData.getEndDate());
            eventDetails.setEventFullAddress(eventData.getLocation().getFullAddress());
            eventDetails.setLatLong(eventData.getLocation().getGeoJson().getCoordinates());
            eventsList.add(eventDetails);
        }
        return eventsList;
    }
}
