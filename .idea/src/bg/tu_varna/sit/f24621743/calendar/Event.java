package bg.tu_varna.sit.f24621743.calendar;

public class Event {
    private String date;
    private String startTime;
    private String endTime;
    private String name;
    private String note;

    public Event(String date, String startTime, String endTime, String name, String description) {
        this.date = date;
        this.note = description;
        this.endTime = endTime;
        this.name = name;
        this.startTime = startTime;
    }

    @Override
    public String toString() {
        return  date + " " + startTime + " " + endTime + " " + name + " " + note;
    }
}
