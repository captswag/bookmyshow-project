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
import anjithsasindran.projectdemoanjith.parcelable.MicrositeSponsorsList;

/**
 * Created by Anjith Sasindran
 * on 23-Mar-16.
 */
public class MicrositeSponsorListFragment extends Fragment {

    TextView header1, header2, header3, header4, header5;
    TextView para1, para2, para3, para4, para5;
    ImageView image1, image2;
    View view;
    MicrositeSponsorsList sponsorsList;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        sponsorsList = getArguments().getParcelable("data");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.microsite_sponsors_list_layout, container, false);
        setupViews();
        initializeViews();
        return view;
    }

    public void setupViews() {
        header1 = (TextView) view.findViewById(R.id.microsite_sponsors_list_header_1);
        header2 = (TextView) view.findViewById(R.id.microsite_sponsors_list_header_2);
        header3 = (TextView) view.findViewById(R.id.microsite_sponsors_list_header_3);
        header4 = (TextView) view.findViewById(R.id.microsite_sponsors_list_header_4);
        header5 = (TextView) view.findViewById(R.id.microsite_sponsors_list_header_5);
        para1 = (TextView) view.findViewById(R.id.microsite_sponsors_list_para_1);
        para2 = (TextView) view.findViewById(R.id.microsite_sponsors_list_para_2);
        para3 = (TextView) view.findViewById(R.id.microsite_sponsors_list_para_3);
        para4 = (TextView) view.findViewById(R.id.microsite_sponsors_list_para_4);
        para5 = (TextView) view.findViewById(R.id.microsite_sponsors_list_para_5);
        image1 = (ImageView) view.findViewById(R.id.microsite_sponsors_list_image_1);
        image2 = (ImageView) view.findViewById(R.id.microsite_sponsors_list_image_2);
    }

    public void initializeViews() {
        header1.setText(sponsorsList.getFirstHeader());
        header2.setText(sponsorsList.getSecondHeader());
        header3.setText(sponsorsList.getThirdHeader());
        header4.setText(sponsorsList.getForthHeader());
        header5.setText(sponsorsList.getFifthHeader());
        para1.setText(sponsorsList.getFirstPara());
        para2.setText(sponsorsList.getSecondPara());
        para3.setText(sponsorsList.getThirdPara());
        para4.setText(sponsorsList.getForthPara());
        para5.setText(sponsorsList.getFifthPara());
        Picasso.with(image1.getContext()).load(sponsorsList.getFirstImageUrl())
                .resize(400, 225).into(image1);
        Picasso.with(image2.getContext()).load(sponsorsList.getSecondImageUrl())
                .resize(400, 225).into(image2);
    }
}