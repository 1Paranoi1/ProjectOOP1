package bg.tu_varna.sit.f24621743.calendar;

import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;

import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Event> events;
    private EventParser eventParser;

    private static Calendar instance;

    private Calendar() {
        events = new ArrayList<Event>();
        eventParser = new EventParser();
    }

    public static Calendar getInstance() {
        if (instance == null) {
            instance = new Calendar();
        }
        return instance;
    }

    public void addEvent(String[] parameters) {
        Event event = eventParser.parsEvent(parameters);
        events.add(event);
    }

    public void pushCalendar() {
        CommitBuffer.getInstance().setBuffer(new StringBuilder(this.toString()));
        System.out.println(CommitBuffer.getInstance().getBuffer().toString());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (Event event : events) {
            sb.append(event.toString()).append("\n");
        }
        return sb.toString();
    }
}
