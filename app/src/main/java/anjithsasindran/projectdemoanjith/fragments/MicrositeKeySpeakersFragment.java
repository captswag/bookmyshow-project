package anjithsasindran.projectdemoanjith.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.squareup.picasso.Picasso;

import anjithsasindran.projectdemoanjith.R;
import anjithsasindran.projectdemoanjith.parcelable.MicrositeKeySpeakers;

/**
 * Created by Anjith Sasindran
 * on 23-Mar-16.
 */
public class MicrositeKeySpeakersFragment extends Fragment {

    View view;
    TextView header1, header2, header3, header4;
    TextView para1, para2, para3, para4;
    ImageView image1, image2, image3, image4;
    MicrositeKeySpeakers keySpeakers;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        keySpeakers = getArguments().getParcelable("data");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.microsite_key_speakers_layout, container, false);
        setupViews();
        initializeViews();
        return view;
    }

    public void setupViews() {
        header1 = (TextView) view.findViewById(R.id.microsite_key_speakers_header_1);
        header2 = (TextView) view.findViewById(R.id.microsite_key_speakers_header_2);
        header3 = (TextView) view.findViewById(R.id.microsite_key_speakers_header_3);
        header4 = (TextView) view.findViewById(R.id.microsite_key_speakers_header_4);
        para1 = (TextView) view.findViewById(R.id.microsite_key_speakers_para_1);
        para2 = (TextView) view.findViewById(R.id.microsite_key_speakers_para_2);
        para3 = (TextView) view.findViewById(R.id.microsite_key_speakers_para_3);
        para4 = (TextView) view.findViewById(R.id.microsite_key_speakers_para_4);
        image1 = (ImageView) view.findViewById(R.id.microsite_key_speakers_image_1);
        image2 = (ImageView) view.findViewById(R.id.microsite_key_speakers_image_2);
        image3 = (ImageView) view.findViewById(R.id.microsite_key_speakers_image_3);
        image4 = (ImageView) view.findViewById(R.id.microsite_key_speakers_image_4);
    }

    public void initializeViews() {
        header1.setText(keySpeakers.getFirstHeader());
        header2.setText(keySpeakers.getSecondHeader());
        header3.setText(keySpeakers.getThirdHeader());
        header4.setText(keySpeakers.getForthHeader());
        para1.setText(keySpeakers.getFirstPara());
        para2.setText(keySpeakers.getSecondPara());
        para3.setText(keySpeakers.getThirdPara());
        para4.setText(keySpeakers.getForthPara());
        Picasso.with(image1.getContext()).load(keySpeakers.getFirstImage()).centerCrop()
                .resize(400, 225).into(image1);
        Picasso.with(image2.getContext()).load(keySpeakers.getSecondImage()).centerCrop()
                .resize(400, 225).into(image2);
        Picasso.with(image3.getContext()).load(keySpeakers.getThirdImage()).centerCrop()
                .resize(400, 225).into(image3);
        Picasso.with(image4.getContext()).load(keySpeakers.getForthImage()).centerCrop()
                .resize(400, 225).into(image4);
    }
}