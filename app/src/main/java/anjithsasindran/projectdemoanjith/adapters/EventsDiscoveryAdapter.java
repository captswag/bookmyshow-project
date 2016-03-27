package anjithsasindran.projectdemoanjith.adapters;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Color;
import android.graphics.drawable.BitmapDrawable;
import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.FragmentManager;
import android.support.v7.graphics.Palette;
import android.support.v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.style.DynamicDrawableSpan;
import android.text.style.ImageSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.squareup.picasso.Callback;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;

import anjithsasindran.projectdemoanjith.R;
import anjithsasindran.projectdemoanjith.fragments.EventMicrositeFragment;
import anjithsasindran.projectdemoanjith.helpers.ConnectivityHelper;
import anjithsasindran.projectdemoanjith.helpers.DayHelper;
import anjithsasindran.projectdemoanjith.helpers.MonthHelper;
import anjithsasindran.projectdemoanjith.models.EventDetails;
import anjithsasindran.projectdemoanjith.viewholders.EventsDiscoveryViewHolder;

/**
 * Created by Anjith Sasindran
 * on 20-Mar-16.
 */
public class EventsDiscoveryAdapter extends RecyclerView.Adapter<EventsDiscoveryViewHolder> {

    private final ArrayList<EventDetails> eventList;
    private final Context context;
    private final FragmentManager mFragmentManager;

    public EventsDiscoveryAdapter(ArrayList<EventDetails> eventList, Context context, FragmentManager fm) {
        this.eventList = eventList;
        this.context = context;
        this.mFragmentManager = fm;
    }

    @Override
    public EventsDiscoveryViewHolder onCreateViewHolder(ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.events_discovery_card,
                parent, false);
        return new EventsDiscoveryViewHolder(view);
    }

    @Override
    public void onBindViewHolder(final EventsDiscoveryViewHolder holder, int position) {
        final EventDetails eventDetails = eventList.get(position);

        Picasso.with(holder.eventImage.getContext())
                .load(eventDetails.getEventImageUrl())
                .centerCrop()
                .resize(480, 270)
                .into(holder.eventImage, new Callback() {
                    @Override
                    public void onSuccess() {
                        Bitmap bitmapImage;
                        if (holder.eventImage.getDrawable() instanceof BitmapDrawable) {
                            bitmapImage = ((BitmapDrawable) holder.eventImage.getDrawable())
                                    .getBitmap();
                        } else {
                            bitmapImage = null;
                        }

                        if (bitmapImage != null) {
                            Palette.from(bitmapImage).generate(new Palette.PaletteAsyncListener() {
                                @Override
                                public void onGenerated(Palette palette) {
                                    int color = palette.getVibrantColor(Color.BLACK);
                                    color = Color.argb(236, Color.red(color),
                                            Color.green(color), Color.blue(color));
                                    holder.eventCardImageTextContainer
                                            .setBackgroundColor(color);
                                }
                            });
                        }
                    }

                    @Override
                    public void onError() {

                    }
                });

        holder.eventName.setText(eventDetails.getEventName());

        final SpannableStringBuilder eventCityStringBuilder = new SpannableStringBuilder();
        eventCityStringBuilder.append(" ");
        eventCityStringBuilder.setSpan(new ImageSpan(context, R.drawable.ic_place_white_14dp, DynamicDrawableSpan.ALIGN_BASELINE),
                eventCityStringBuilder.length() - 1, eventCityStringBuilder.length(), 0);
        eventCityStringBuilder.append(eventDetails.getEventCity());

        holder.eventCity.setText(eventCityStringBuilder);

        holder.eventDay.setText(DayHelper.findRespectiveDay
                (eventDetails.getEventStartCalendar(), eventDetails.getEventEndCalendar()));
        holder.eventDate.setText(MonthHelper.findRespectiveMonth
                (eventDetails.getEventStartCalendar(), eventDetails.getEventEndCalendar()));

        holder.eventFullAddress.setText(eventDetails.getEventFullAddress());
        holder.eventLocationButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Intent.ACTION_VIEW);
                intent.setData(eventDetails.getLatLong());
                context.startActivity(intent);
            }
        });

        if (holder.eventDay.getText().equals("Expired"))
            holder.eventTicketButton.setEnabled(false);

        holder.eventCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (ConnectivityHelper.isNetworkAvaiable(context)) {
                    final EventMicrositeFragment eventMicrositeFragment = new EventMicrositeFragment();
                    Bundle bundle = new Bundle();
                    Bitmap bitmapImage;
                    if (holder.eventImage.getDrawable() instanceof BitmapDrawable) {
                        bitmapImage = ((BitmapDrawable) holder.eventImage.getDrawable())
                                .getBitmap();
                    } else {
                        bitmapImage = null;
                    }
                    if (bitmapImage != null) {
                        bundle.putParcelable("banner_image", bitmapImage);
                    }
                    bundle.putString("event_name", eventDetails.getEventName());
                    bundle.putString("event_location", eventDetails.getEventFullAddress());
                    bundle.putString("event_date", holder.eventDate.getText().toString());
                    bundle.putString("event_image_url", eventDetails.getEventImageUrl());
                    eventMicrositeFragment.setArguments(bundle);

                    new Handler().postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            mFragmentManager.beginTransaction()
                                    .setCustomAnimations(R.anim.slide_left, 0, 0, R.anim.slide_right)
                                    .add(R.id.root_container, eventMicrositeFragment)
                                    .addToBackStack("EventMicrositeFragment")
                                    .commit();
                        }
                    }, 100);
                } else {
                    Toast.makeText(context, "No internet connection", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }

    @Override
    public int getItemCount() {
        return eventList.size();
    }
}