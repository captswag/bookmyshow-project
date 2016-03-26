package anjithsasindran.projectdemoanjith.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import anjithsasindran.projectdemoanjith.R;
import anjithsasindran.projectdemoanjith.helpers.ParseToCalendarHelper;
import anjithsasindran.projectdemoanjith.helpers.TimelineHelper;
import anjithsasindran.projectdemoanjith.parcelable.MicrositeTimeline;

/**
 * Created by Anjith Sasindran
 * on 23-Mar-16.
 */
public class MicrositeTimelineFragment extends Fragment {

    View view;
    TextView header1, header2, header3, header4;
    TextView para1, para2, para3, para4;
    TextView timelineHeader1, timelineHeader2, timelineHeader3, timelineHeader4, timelineHeader5, timelineHeader6;
    TextView timelinePara1, timelinePara2, timelinePara3, timelinePara4, timelinePara5, timelinePara6;
    TextView timelineTime1, timelineTime2, timelineTime3, timelineTime4, timelineTime5, timelineTime6;
    MicrositeTimeline timeline;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        timeline = getArguments().getParcelable("data");
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.microsite_timeline_layout, container, false);
        setupViews();
        initializeViews();
        return view;
    }

    public void setupViews() {
        header1 = (TextView) view.findViewById(R.id.microsite_timeline_header_1);
        header2 = (TextView) view.findViewById(R.id.microsite_timeline_header_2);
        header3 = (TextView) view.findViewById(R.id.microsite_timeline_header_3);
        header4 = (TextView) view.findViewById(R.id.microsite_timeline_header_4);

        para1 = (TextView) view.findViewById(R.id.microsite_timeline_para_1);
        para2 = (TextView) view.findViewById(R.id.microsite_timeline_para_2);
        para3 = (TextView) view.findViewById(R.id.microsite_timeline_para_3);
        para4 = (TextView) view.findViewById(R.id.microsite_timeline_para_4);

        timelineHeader1 = (TextView) view.findViewById(R.id.microsite_timeline_1_header_1);
        timelineHeader2 = (TextView) view.findViewById(R.id.microsite_timeline_1_header_2);
        timelineHeader3 = (TextView) view.findViewById(R.id.microsite_timeline_2_header_1);
        timelineHeader4 = (TextView) view.findViewById(R.id.microsite_timeline_2_header_2);
        timelineHeader5 = (TextView) view.findViewById(R.id.microsite_timeline_2_header_3);
        timelineHeader6 = (TextView) view.findViewById(R.id.microsite_timeline_2_header_4);

        timelinePara1 = (TextView) view.findViewById(R.id.microsite_timeline_1_para1);
        timelinePara2 = (TextView) view.findViewById(R.id.microsite_timeline_1_para2);
        timelinePara3 = (TextView) view.findViewById(R.id.microsite_timeline_2_para1);
        timelinePara4 = (TextView) view.findViewById(R.id.microsite_timeline_2_para2);
        timelinePara5 = (TextView) view.findViewById(R.id.microsite_timeline_2_para3);
        timelinePara6 = (TextView) view.findViewById(R.id.microsite_timeline_2_para4);

        timelineTime1 = (TextView) view.findViewById(R.id.microsite_timeline_1_time_1);
        timelineTime2 = (TextView) view.findViewById(R.id.microsite_timeline_1_time_2);
        timelineTime3 = (TextView) view.findViewById(R.id.microsite_timeline_2_time_1);
        timelineTime4 = (TextView) view.findViewById(R.id.microsite_timeline_2_time_2);
        timelineTime5 = (TextView) view.findViewById(R.id.microsite_timeline_2_time_3);
        timelineTime6 = (TextView) view.findViewById(R.id.microsite_timeline_2_time_4);
    }

    public void initializeViews() {
        header1.setText(timeline.getFirstHeader());
        header2.setText(timeline.getSecondHeader());
        header3.setText(timeline.getThirdHeader());
        header4.setText(timeline.getForthHeader());
        para1.setText(timeline.getFirstPara());
        para2.setText(timeline.getSecondPara());
        para3.setText(timeline.getThirdPara());
        para4.setText(timeline.getForthPara());
        timelineHeader1.setText(timeline.getTimelineHeader1());
        timelineHeader2.setText(timeline.getTimelineHeader2());
        timelineHeader3.setText(timeline.getTimelineHeader3());
        timelineHeader4.setText(timeline.getTimelineHeader4());
        timelineHeader5.setText(timeline.getTimelineHeader5());
        timelineHeader6.setText(timeline.getTimelineHeader6());
        timelinePara1.setText(timeline.getTimelinePara1());
        timelinePara2.setText(timeline.getTimelinePara2());
        timelinePara3.setText(timeline.getTimelinePara3());
        timelinePara4.setText(timeline.getTimelinePara4());
        timelinePara5.setText(timeline.getTimelinePara5());
        timelinePara6.setText(timeline.getTimelinePara6());

        timelineTime1.setText(TimelineHelper.
                getFormattedTime(ParseToCalendarHelper.
                        convertStringDateForTimelineToCalendar(timeline.getTimelineDate1())));
        timelineTime2.setText(TimelineHelper.
                getFormattedTime(ParseToCalendarHelper.
                        convertStringDateForTimelineToCalendar(timeline.getTimelineDate2())));
        timelineTime3.setText(TimelineHelper.
                getFormattedTime(ParseToCalendarHelper.
                        convertStringDateForTimelineToCalendar(timeline.getTimelineDate3())));
        timelineTime4.setText(TimelineHelper.
                getFormattedTime(ParseToCalendarHelper.
                        convertStringDateForTimelineToCalendar(timeline.getTimelineDate4())));
        timelineTime5.setText(TimelineHelper.
                getFormattedTime(ParseToCalendarHelper.
                        convertStringDateForTimelineToCalendar(timeline.getTimelineDate5())));
        timelineTime6.setText(TimelineHelper.
                getFormattedTime(ParseToCalendarHelper.
                        convertStringDateForTimelineToCalendar(timeline.getTimelineDate6())));
    }
}