
package anjithsasindran.projectdemoanjith.models.eventsmicrosite;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Image {

    @SerializedName("original")
    @Expose
    private String original;

    /**
     * @return The original
     */
    public String getOriginal() {
        return original;
    }

    /**
     * @param original The original
     */
    public void setOriginal(String original) {
        this.original = original;
    }

}
