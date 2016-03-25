package anjithsasindran.projectdemoanjith.helpers;

import android.util.Log;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * Created by Anjith Sasindran
 * on 21-Mar-16.
 * Convert the json date data to Calendar format.
 */
public class ParseToCalendar {

    public static Calendar convertStringDateToCalendar(String stringDate) {
        StringBuilder stringBuilder = new StringBuilder(stringDate);
        stringBuilder.setCharAt(10, ' ');
        Calendar calendar = Calendar.getInstance();
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS");
        try {
            calendar.setTime(sdf.parse(stringBuilder.toString()));
        } catch (ParseException e) {
            Log.d("ParseException", e.toString());
        }
        return calendar;
    }
}
