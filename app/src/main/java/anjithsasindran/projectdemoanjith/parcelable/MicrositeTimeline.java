package anjithsasindran.projectdemoanjith.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Anjith Sasindran
 * on 24-Mar-16.
 */
public class MicrositeTimeline implements Parcelable {

    private String firstHeader, secondHeader, thirdHeader, forthHeader;
    private String firstPara, secondPara, thirdPara, forthPara;
    private String timelineHeader1, timelineHeader2, timelineHeader3, timelineHeader4,
            timelineHeader5, timelineHeader6;
    private String timelinePara1, timelinePara2, timelinePara3, timelinePara4, timelinePara5,
            timelinePara6;
    private String timelineDate1, timelineDate2, timelineDate3, timelineDate4, timelineDate5,
            timelineDate6;

    public MicrositeTimeline() {

    }

    public String getFirstHeader() {
        return firstHeader;
    }

    public void setFirstHeader(String firstHeader) {
        this.firstHeader = firstHeader;
    }

    public String getSecondHeader() {
        return secondHeader;
    }

    public void setSecondHeader(String secondHeader) {
        this.secondHeader = secondHeader;
    }

    public String getThirdHeader() {
        return thirdHeader;
    }

    public void setThirdHeader(String thirdHeader) {
        this.thirdHeader = thirdHeader;
    }

    public String getForthHeader() {
        return forthHeader;
    }

    public void setForthHeader(String forthHeader) {
        this.forthHeader = forthHeader;
    }

    public String getFirstPara() {
        return firstPara;
    }

    public void setFirstPara(String firstPara) {
        this.firstPara = firstPara;
    }

    public String getSecondPara() {
        return secondPara;
    }

    public void setSecondPara(String secondPara) {
        this.secondPara = secondPara;
    }

    public String getThirdPara() {
        return thirdPara;
    }

    public void setThirdPara(String thirdPara) {
        this.thirdPara = thirdPara;
    }

    public String getForthPara() {
        return forthPara;
    }

    public void setForthPara(String forthPara) {
        this.forthPara = forthPara;
    }

    public String getTimelineHeader1() {
        return timelineHeader1;
    }

    public void setTimelineHeader1(String timelineHeader1) {
        this.timelineHeader1 = timelineHeader1;
    }

    public String getTimelineHeader2() {
        return timelineHeader2;
    }

    public void setTimelineHeader2(String timelineHeader2) {
        this.timelineHeader2 = timelineHeader2;
    }

    public String getTimelineHeader3() {
        return timelineHeader3;
    }

    public void setTimelineHeader3(String timelineHeader3) {
        this.timelineHeader3 = timelineHeader3;
    }

    public String getTimelineHeader4() {
        return timelineHeader4;
    }

    public void setTimelineHeader4(String timelineHeader4) {
        this.timelineHeader4 = timelineHeader4;
    }

    public String getTimelineHeader5() {
        return timelineHeader5;
    }

    public void setTimelineHeader5(String timelineHeader5) {
        this.timelineHeader5 = timelineHeader5;
    }

    public String getTimelineHeader6() {
        return timelineHeader6;
    }

    public void setTimelineHeader6(String timelineHeader6) {
        this.timelineHeader6 = timelineHeader6;
    }

    public String getTimelinePara1() {
        return timelinePara1;
    }

    public void setTimelinePara1(String timelinePara1) {
        this.timelinePara1 = timelinePara1;
    }

    public String getTimelinePara2() {
        return timelinePara2;
    }

    public void setTimelinePara2(String timelinePara2) {
        this.timelinePara2 = timelinePara2;
    }

    public String getTimelinePara3() {
        return timelinePara3;
    }

    public void setTimelinePara3(String timelinePara3) {
        this.timelinePara3 = timelinePara3;
    }

    public String getTimelinePara4() {
        return timelinePara4;
    }

    public void setTimelinePara4(String timelinePara4) {
        this.timelinePara4 = timelinePara4;
    }

    public String getTimelinePara5() {
        return timelinePara5;
    }

    public void setTimelinePara5(String timelinePara5) {
        this.timelinePara5 = timelinePara5;
    }

    public String getTimelinePara6() {
        return timelinePara6;
    }

    public void setTimelinePara6(String timelinePara6) {
        this.timelinePara6 = timelinePara6;
    }

    public String getTimelineDate1() {
        return timelineDate1;
    }

    public void setTimelineDate1(String timelineDate1) {
        this.timelineDate1 = timelineDate1;
    }

    public String getTimelineDate2() {
        return timelineDate2;
    }

    public void setTimelineDate2(String timelineDate2) {
        this.timelineDate2 = timelineDate2;
    }

    public String getTimelineDate3() {
        return timelineDate3;
    }

    public void setTimelineDate3(String timelineDate3) {
        this.timelineDate3 = timelineDate3;
    }

    public String getTimelineDate4() {
        return timelineDate4;
    }

    public void setTimelineDate4(String timelineDate4) {
        this.timelineDate4 = timelineDate4;
    }

    public String getTimelineDate5() {
        return timelineDate5;
    }

    public void setTimelineDate5(String timelineDate5) {
        this.timelineDate5 = timelineDate5;
    }

    public String getTimelineDate6() {
        return timelineDate6;
    }

    public void setTimelineDate6(String timelineDate6) {
        this.timelineDate6 = timelineDate6;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(firstHeader);
        parcel.writeString(secondHeader);
        parcel.writeString(thirdHeader);
        parcel.writeString(forthHeader);
        parcel.writeString(firstPara);
        parcel.writeString(secondPara);
        parcel.writeString(thirdPara);
        parcel.writeString(forthPara);
        parcel.writeString(timelineHeader1);
        parcel.writeString(timelineHeader2);
        parcel.writeString(timelineHeader3);
        parcel.writeString(timelineHeader4);
        parcel.writeString(timelineHeader5);
        parcel.writeString(timelineHeader6);
        parcel.writeString(timelinePara1);
        parcel.writeString(timelinePara2);
        parcel.writeString(timelinePara3);
        parcel.writeString(timelinePara4);
        parcel.writeString(timelinePara5);
        parcel.writeString(timelinePara6);
        parcel.writeString(timelineDate1);
        parcel.writeString(timelineDate2);
        parcel.writeString(timelineDate3);
        parcel.writeString(timelineDate4);
        parcel.writeString(timelineDate5);
        parcel.writeString(timelineDate6);
    }

    protected MicrositeTimeline(Parcel in) {
        firstHeader = in.readString();
        secondHeader = in.readString();
        thirdHeader = in.readString();
        forthHeader = in.readString();
        firstPara = in.readString();
        secondPara = in.readString();
        thirdPara = in.readString();
        forthPara = in.readString();
        timelineHeader1 = in.readString();
        timelineHeader2 = in.readString();
        timelineHeader3 = in.readString();
        timelineHeader4 = in.readString();
        timelineHeader5 = in.readString();
        timelineHeader6 = in.readString();
        timelinePara1 = in.readString();
        timelinePara2 = in.readString();
        timelinePara3 = in.readString();
        timelinePara4 = in.readString();
        timelinePara5 = in.readString();
        timelinePara6 = in.readString();
        timelineDate1 = in.readString();
        timelineDate2 = in.readString();
        timelineDate3 = in.readString();
        timelineDate4 = in.readString();
        timelineDate5 = in.readString();
        timelineDate6 = in.readString();
    }

    public static final Creator<MicrositeTimeline> CREATOR = new Creator<MicrositeTimeline>() {
        @Override
        public MicrositeTimeline createFromParcel(Parcel in) {
            return new MicrositeTimeline(in);
        }

        @Override
        public MicrositeTimeline[] newArray(int size) {
            return new MicrositeTimeline[size];
        }
    };
}
