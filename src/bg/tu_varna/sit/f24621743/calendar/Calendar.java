package bg.tu_varna.sit.f24621743.calendar;

import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;

import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Event> events;
    private EventParser eventParser;
    private CommitBuffer commitBuffer;

    private static Calendar instance;

    private Calendar() {
        events = new ArrayList<>();
        eventParser = new EventParser();

        commitBuffer = new CommitBuffer();
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

    public void addEvent(LocalDate date, LocalTime startTime, LocalTime endTime, String note, String name) {
        Event event = eventParser.parsEvent(date , startTime , endTime , note, name);
        events.add(event);
    }

    public List<Event> getList(){
        return new ArrayList<>(events);
    }

    public void removeEvent(Event event){
        events.remove(event);
    }

    public CommitBuffer getCommitBuffer() {
        return commitBuffer;
    }

    public void clearCalendar() {
        events.clear();
    }

    public Event findEvent(LocalDate date, LocalTime startTime) {
        for(Event e : getList()){
            if(e.getDate().equals(date) && e.getStartTime().equals(startTime)){
                return e;
            }
        }
        return null;
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
