package anjithsasindran.projectdemoanjith.helpers;

import java.util.Calendar;

/**
 * Created by Anjith Sasindran
 * on 24-Mar-16.
 */
public class TimelineHelper {

    public static String getFormattedTime(Calendar startDate) {
        String formattedTime = startDate.get(Calendar.HOUR) + ":"
                + startDate.get(Calendar.MINUTE) + " ";
        switch (startDate.get(Calendar.AM_PM)) {
            case 0:
                formattedTime += "AM";
                break;
            case 1:
                formattedTime += "PM";
                break;
        }
        return formattedTime;
    }
}
