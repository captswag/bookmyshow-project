package anjithsasindran.projectdemoanjith.helpers;

import anjithsasindran.projectdemoanjith.constants.Constants;
import anjithsasindran.projectdemoanjith.models.events.EventsModel;
import anjithsasindran.projectdemoanjith.models.eventsmicrosite.EventMicrositeModel;
import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Anjith Sasindran
 * on 26-Mar-16.
 */
public interface ApiHelper {

    @GET(Constants.EVENT_DISCOVERY_URL)
    Call<EventsModel> requentDiscoveryEvents();

    @GET(Constants.EVENTS_MICROSITE_URL)
    Call<EventMicrositeModel> requestMicrositeEvents();
}
