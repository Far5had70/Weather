package ir.far5had.weather.util;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.Objects;

public class DateUtils {

    public static String dayName(String date){
        SimpleDateFormat df = new SimpleDateFormat("yyyy-MM-dd", Locale.getDefault());

        Date readDate=null;
        try {
            readDate = df.parse(date);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        Calendar c = Calendar.getInstance();
        c.setTime(Objects.requireNonNull(readDate));

        int dayOfWeek = c.get(Calendar.DAY_OF_WEEK);
        String[] days = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        return days[dayOfWeek-1];
    }
}
