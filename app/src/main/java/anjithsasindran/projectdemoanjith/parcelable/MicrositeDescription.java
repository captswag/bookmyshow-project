package anjithsasindran.projectdemoanjith.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Anjith Sasindran
 * on 24-Mar-16.
 * Parcelable data passed to MicrositeDescriptionFragment
 */
public class MicrositeDescription implements Parcelable {
    private String firstHeader, firstPara;
    private String secondHeader, secondPara;
    private String thirdHeader, thirdPara;

    public MicrositeDescription() {

    }

    public String getFirstHeader() {
        return firstHeader;
    }

    public void setFirstHeader(String firstHeader) {
        this.firstHeader = firstHeader;
    }

    public String getFirstPara() {
        return firstPara;
    }

    public void setFirstPara(String firstPara) {
        this.firstPara = firstPara;
    }

    public String getSecondHeader() {
        return secondHeader;
    }

    public void setSecondHeader(String secondHeader) {
        this.secondHeader = secondHeader;
    }

    public String getSecondPara() {
        return secondPara;
    }

    public void setSecondPara(String secondPara) {
        this.secondPara = secondPara;
    }

    public String getThirdHeader() {
        return thirdHeader;
    }

    public void setThirdHeader(String thirdHeader) {
        this.thirdHeader = thirdHeader;
    }

    public String getThirdPara() {
        return thirdPara;
    }

    public void setThirdPara(String thirdPara) {
        this.thirdPara = thirdPara;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(firstHeader);
        parcel.writeString(firstPara);
        parcel.writeString(secondHeader);
        parcel.writeString(secondPara);
        parcel.writeString(thirdHeader);
        parcel.writeString(thirdPara);
    }

    private MicrositeDescription(Parcel in) {
        this.firstHeader = in.readString();
        this.firstPara = in.readString();
        this.secondHeader = in.readString();
        this.secondPara = in.readString();
        this.thirdHeader = in.readString();
        this.thirdPara = in.readString();
    }

    public static final Parcelable.Creator<MicrositeDescription> CREATOR = new Parcelable.Creator<MicrositeDescription>() {

        @Override
        public MicrositeDescription createFromParcel(Parcel parcel) {
            return new MicrositeDescription(parcel);
        }

        @Override
        public MicrositeDescription[] newArray(int i) {
            return new MicrositeDescription[i];
        }
    };
}