package bg.tu_varna.sit.f24621743.calendar;

import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;


public class ActiveCalendar {
    private static Calendar activeCalendar;

    public static void setActiveCalendar(Calendar activeCalendar) {
        ActiveCalendar.activeCalendar = activeCalendar;
    }

    public static Calendar getActiveCalendar() throws FileNotOpenException{
        if(activeCalendar == null) throw new FileNotOpenException("No active calendar");
        return activeCalendar;
    }
}
