package bg.tu_varna.sit.f24621743.calendar;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

public class CalendarManager {
    private static Map<File, Calendar> calendars = new HashMap<File, Calendar>();

    public static Calendar getCalendar(File file) {
        Calendar calendar = calendars.get(file);

        if (calendar == null) {
            calendar = new Calendar(file);
            calendars.put(file, calendar);
        }
        return calendar;
    }
}
