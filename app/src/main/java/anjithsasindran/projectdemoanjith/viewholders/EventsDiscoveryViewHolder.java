package anjithsasindran.projectdemoanjith.viewholders;

import android.support.v7.widget.CardView;
import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;

import anjithsasindran.projectdemoanjith.R;

/**
 * Created by Anjith Sasindran
 * on 20-Mar-16.
 */
public class EventsDiscoveryViewHolder extends RecyclerView.ViewHolder {

    public final CardView eventCard;
    public final ImageView eventImage;
    public final TextView eventName;
    public final TextView eventCity;
    public final TextView eventDay;
    public final LinearLayout eventCardImageTextContainer;
    public final TextView eventFullAddress;
    public final TextView eventDate;
    public final Button eventLocationButton;

    public EventsDiscoveryViewHolder(View itemView) {
        super(itemView);

        eventCard = (CardView) itemView.findViewById(R.id.event_card);
        eventImage = (ImageView) itemView.findViewById(R.id.event_image);
        eventName = (TextView) itemView.findViewById(R.id.event_name);
        eventCity = (TextView) itemView.findViewById(R.id.event_city);
        eventDay = (TextView) itemView.findViewById(R.id.event_day);
        eventCardImageTextContainer = (LinearLayout) itemView.findViewById(R.id.event_card_image_text_container);
        eventFullAddress = (TextView) itemView.findViewById(R.id.event_full_address);
        eventDate = (TextView) itemView.findViewById(R.id.event_date);
        eventLocationButton = (Button) itemView.findViewById(R.id.event_location_button);
    }
}