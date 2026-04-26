package bg.tu_varna.sit.f24621743.calendar;

import java.io.File;
import java.time.LocalDate;
import java.time.LocalTime;
import java.util.ArrayList;
import java.util.List;

public class Calendar {
    private List<Event> events;
    private EventParser eventParser;
    private File file;

    private static Calendar instance;

    protected Calendar(File file) {
        events = new ArrayList<>();
        eventParser = new EventParser();

        file = file;
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

    public File getFile() {
        return file;
    }
}
