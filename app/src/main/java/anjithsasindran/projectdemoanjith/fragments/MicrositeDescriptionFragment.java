package anjithsasindran.projectdemoanjith.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import anjithsasindran.projectdemoanjith.R;
import anjithsasindran.projectdemoanjith.parcelable.MicrositeDescription;

/**
 * Created by Anjith Sasindran
 * on 22-Mar-16.
 */
public class MicrositeDescriptionFragment extends Fragment {

    View view;
    TextView header1, header2, header3;
    TextView para1, para2, para3;
    MicrositeDescription description;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        description = getArguments().getParcelable("data");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.microsite_description_layout, container, false);
        setupViews();
        initializeViews();
        return view;
    }

    public void setupViews() {
        header1 = (TextView) view.findViewById(R.id.microsite_description_header_1);
        header2 = (TextView) view.findViewById(R.id.microsite_description_header_2);
        header3 = (TextView) view.findViewById(R.id.microsite_description_header_3);
        para1 = (TextView) view.findViewById(R.id.microsite_description_para_1);
        para2 = (TextView) view.findViewById(R.id.microsite_description_para_2);
        para3 = (TextView) view.findViewById(R.id.microsite_description_para_3);
    }

    public void initializeViews() {
        header1.setText(description.getFirstHeader());
        header2.setText(description.getSecondHeader());
        header3.setText(description.getThirdHeader());
        para1.setText(description.getFirstPara());
        para2.setText(description.getSecondPara());
        para3.setText(description.getThirdPara());
    }
}