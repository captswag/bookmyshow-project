package anjithsasindran.projectdemoanjith.helpers;

import java.util.Calendar;

/**
 * Created by Anjith Sasindran
 * on 21-Mar-16.
 * MonthHelper returns the month name in String with 3 characters, eg. Jan
 * It also calculates whether the start date and end date are equal, or are in the same month
 * or otherwise
 */
public class MonthHelper {

    public static String findRespectiveMonth(Calendar startDate, Calendar endDate) {
        String formattedData;

        if ((startDate.get(Calendar.DAY_OF_MONTH) == endDate.get(Calendar.DAY_OF_MONTH)) &&
                (startDate.get(Calendar.MONTH) == endDate.get(Calendar.MONTH)) &&
                (startDate.get(Calendar.YEAR) == endDate.get(Calendar.YEAR))) {
            formattedData = getMonthInString(startDate.get(Calendar.MONTH)) + " " +
                    startDate.get(Calendar.DAY_OF_MONTH) + ", " + startDate.get(Calendar.YEAR);
        } else if (startDate.get(Calendar.MONTH) == endDate.get(Calendar.MONTH)) {
            formattedData = getMonthInString(startDate.get(Calendar.MONTH)) + " " +
                    startDate.get(Calendar.DAY_OF_MONTH) + " - " +
                    endDate.get(Calendar.DAY_OF_MONTH) + ", " +
                    startDate.get(Calendar.YEAR);
        } else {
            formattedData = getMonthInString(startDate.get(Calendar.MONTH)) + " " +
                    startDate.get(Calendar.DAY_OF_MONTH) + " - " +
                    getMonthInString(endDate.get(Calendar.MONTH)) + " " +
                    endDate.get(Calendar.DAY_OF_MONTH) + ", " + endDate.get(Calendar.YEAR);

        }
        return formattedData;
    }

    public static String getMonthInString(int MONTH_OF_YEAR) {
        String month = null;
        switch (MONTH_OF_YEAR) {
            case 0:
                month = "Jan";
                break;
            case 1:
                month = "Feb";
                break;
            case 2:
                month = "Mar";
                break;
            case 3:
                month = "Apr";
                break;
            case 4:
                month = "May";
                break;
            case 5:
                month = "June";
                break;
            case 6:
                month = "July";
                break;
            case 7:
                month = "Aug";
                break;
            case 8:
                month = "Sep";
                break;
            case 9:
                month = "Oct";
                break;
            case 10:
                month = "Nov";
                break;
            case 11:
                month = "Dec";
                break;
        }
        return month;
    }
}