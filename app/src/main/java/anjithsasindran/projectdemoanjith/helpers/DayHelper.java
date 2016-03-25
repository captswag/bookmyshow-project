package anjithsasindran.projectdemoanjith.helpers;

import java.util.Calendar;

/**
 * Created by Anjith Sasindran
 * on 21-Mar-16.
 * DayHelper helps to get the day in String, eg. Monday
 * It also calculates whether the event is a passed event, eg. Expired
 * And it returns the String
 */
public class DayHelper {

    public static String findRespectiveDay(Calendar startDate, Calendar endDate) {

        String day = null;

        Calendar today = Calendar.getInstance();

        if (endDate.before(today)) {
            day = "Expired";
            return day;
        }

        switch (startDate.get(Calendar.DAY_OF_WEEK)) {
            case 0:
                day = "Sunday";
                break;
            case 1:
                day = "Monday";
                break;
            case 2:
                day = "Tuesday";
                break;
            case 3:
                day = "Wednesday";
                break;
            case 4:
                day = "Thursday";
                break;
            case 5:
                day = "Friday";
                break;
            case 6:
                day = "Saturday";
                break;
        }
        return day;
    }
}