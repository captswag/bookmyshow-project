package anjithsasindran.projectdemoanjith.parcelable;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by Anjith Sasindran
 * on 24-Mar-16.
 * Parcelable data passed to MicrositeKeySpeakers
 */
public class MicrositeKeySpeakers implements Parcelable {

    private String firstHeader, secondHeader, thirdHeader, forthHeader;
    private String firstPara, secondPara, thirdPara, forthPara;
    private String firstImage, secondImage, thirdImage, forthImage;

    public MicrositeKeySpeakers() {

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

    public String getFirstImage() {
        return firstImage;
    }

    public void setFirstImage(String firstImage) {
        this.firstImage = firstImage;
    }

    public String getSecondImage() {
        return secondImage;
    }

    public void setSecondImage(String secondImage) {
        this.secondImage = secondImage;
    }

    public String getThirdImage() {
        return thirdImage;
    }

    public void setThirdImage(String thirdImage) {
        this.thirdImage = thirdImage;
    }

    public String getForthImage() {
        return forthImage;
    }

    public void setForthImage(String forthImage) {
        this.forthImage = forthImage;
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
        parcel.writeString(firstImage);
        parcel.writeString(secondImage);
        parcel.writeString(thirdImage);
        parcel.writeString(forthImage);
    }

    private MicrositeKeySpeakers(Parcel in) {
        firstHeader = in.readString();
        secondHeader = in.readString();
        thirdHeader = in.readString();
        forthHeader = in.readString();
        firstPara = in.readString();
        secondPara = in.readString();
        thirdPara = in.readString();
        forthPara = in.readString();
        firstImage = in.readString();
        secondImage = in.readString();
        thirdImage = in.readString();
        forthImage = in.readString();
    }

    public static final Creator<MicrositeKeySpeakers> CREATOR = new Creator<MicrositeKeySpeakers>() {
        @Override
        public MicrositeKeySpeakers createFromParcel(Parcel in) {
            return new MicrositeKeySpeakers(in);
        }

        @Override
        public MicrositeKeySpeakers[] newArray(int size) {
            return new MicrositeKeySpeakers[size];
        }
    };

}