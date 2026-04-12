package bg.tu_varna.sit.f24621743.calendar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Objects;

public class Event{
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String name;
    private String note;
    private boolean holiday;
    //builder pattern prob

    DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yy");
    DateTimeFormatter timePattern = DateTimeFormatter.ofPattern("H:mm");

    private Event(EventBuilder builder) {
        date = builder.date;
        startTime = builder.startTime;
        endTime = builder.endTime;
        name = builder.name;
        note = builder.note;
        holiday = builder.holiday;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    public static class EventBuilder {
        private LocalDate date;
        private LocalTime startTime;
        private LocalTime endTime;
        private String name;
        private String note;
        private boolean holiday;

        public EventBuilder(LocalDate date, LocalTime startTime) {
            this.date = date;
            this.startTime = startTime;
        }

        public EventBuilder withEndTime(LocalTime endTime) {
            this.endTime = endTime;
            return this;
        }
        public EventBuilder withName(String name) {
            this.name = name;
            return this;
        }
        public EventBuilder withNote(String note) {
            this.note = note;
            return this;
        }
        public EventBuilder withHoliday(boolean holiday) {
            this.holiday = holiday;
            return this;
        }

        public Event build () {
                return new Event(this);
        }
    }

    @Override
    public String toString() {
        String holiday = "workday";
        if(this.holiday)
            holiday = "holiday";

        return date.format(datePattern) + " " + startTime.format(timePattern) + " " + endTime.format(timePattern) + " " + name + " " + note + " " + holiday;
    }

    public LocalDate getDate() {
        return date;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public void setHoliday(boolean holiday) {
        this.holiday = holiday;
    }

    public String getName() {
        return name;
    }

    public String getNote() {
        return note;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    public void setEndTime(LocalTime endTime) {
        this.endTime = endTime;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public void setStartTime(LocalTime startTime) {
        this.startTime = startTime;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof Event event)) return false;
        return Objects.equals(date, event.date) && Objects.equals(startTime, event.startTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(date, startTime);
    }


}
