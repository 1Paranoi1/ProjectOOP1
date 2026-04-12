package bg.tu_varna.sit.f24621743.commandHandling.helperClasses;

import bg.tu_varna.sit.f24621743.calendar.Event;

import java.util.List;

public class Print {
    private Event event;

    public static void printEvent(Event e){
        System.out.println(e.toString());
    }
    public static void printEvents(List<Event> events){
        for(Event e: events){
            System.out.println(e.toString());
        }
    }
}
