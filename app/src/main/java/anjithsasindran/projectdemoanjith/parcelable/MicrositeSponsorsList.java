package anjithsasindran.projectdemoanjith.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Anjith Sasindran
 * on 24-Mar-16.
 */
public class MicrositeSponsorsList implements Parcelable {

    private String firstHeader, secondHeader, thirdHeader, forthHeader, fifthHeader;
    private String firstPara, secondPara, thirdPara, forthPara, fifthPara;
    private String firstImageUrl, secondImageUrl;

    public MicrositeSponsorsList() {

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

    public String getFifthHeader() {
        return fifthHeader;
    }

    public void setFifthHeader(String fifthHeader) {
        this.fifthHeader = fifthHeader;
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

    public String getFifthPara() {
        return fifthPara;
    }

    public void setFifthPara(String fifthPara) {
        this.fifthPara = fifthPara;
    }

    public String getFirstImageUrl() {
        return firstImageUrl;
    }

    public void setFirstImageUrl(String firstImageUrl) {
        this.firstImageUrl = firstImageUrl;
    }

    public String getSecondImageUrl() {
        return secondImageUrl;
    }

    public void setSecondImageUrl(String secondImageUrl) {
        this.secondImageUrl = secondImageUrl;
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
        parcel.writeString(fifthHeader);
        parcel.writeString(firstPara);
        parcel.writeString(secondPara);
        parcel.writeString(thirdPara);
        parcel.writeString(forthPara);
        parcel.writeString(fifthPara);
        parcel.writeString(firstImageUrl);
        parcel.writeString(secondImageUrl);
    }

    protected MicrositeSponsorsList(Parcel in) {
        firstHeader = in.readString();
        secondHeader = in.readString();
        thirdHeader = in.readString();
        forthHeader = in.readString();
        fifthHeader = in.readString();
        firstPara = in.readString();
        secondPara = in.readString();
        thirdPara = in.readString();
        forthPara = in.readString();
        fifthPara = in.readString();
        firstImageUrl = in.readString();
        secondImageUrl = in.readString();
    }

    public static final Parcelable.Creator<MicrositeSponsorsList> CREATOR = new Parcelable.Creator<MicrositeSponsorsList>() {

        @Override
        public MicrositeSponsorsList createFromParcel(Parcel parcel) {
            return new MicrositeSponsorsList(parcel);
        }

        @Override
        public MicrositeSponsorsList[] newArray(int i) {
            return new MicrositeSponsorsList[i];
        }
    };
}