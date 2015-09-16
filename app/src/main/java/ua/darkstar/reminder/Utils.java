package ua.darkstar.reminder;

import java.text.SimpleDateFormat;

/**
 * Created by Ярослав on 16.09.2015.
 */
public class Utils {
    public static String getDate(long date){
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yy");
        return dateFormat.format(date);
    }

    public static String getTime(long date){
        SimpleDateFormat timeFormat = new SimpleDateFormat("HH.mm");
        return timeFormat.format(date);
    }
}
