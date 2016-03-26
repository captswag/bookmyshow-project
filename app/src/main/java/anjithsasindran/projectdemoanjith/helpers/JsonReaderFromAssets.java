package anjithsasindran.projectdemoanjith.helpers;

import android.content.Context;
import android.util.Log;

import java.io.IOException;
import java.io.InputStream;

/**
 * Created by Anjith Sasindran
 * on 20-Mar-16.
 * Read json files from assets folder
 */
public class JsonReaderFromAssets {

    public static String loadJson(Context context, String jsonFile) {
        String json = null;

        try {
            InputStream is = context.getAssets().open(jsonFile);
            int size = is.available();
            byte[] buffer = new byte[size];
            is.read(buffer);
            is.close();
            json = new String(buffer, "UTF-8");
        } catch (IOException e) {
            Log.e("IOException", e.toString());
        }

        return json;
    }
}