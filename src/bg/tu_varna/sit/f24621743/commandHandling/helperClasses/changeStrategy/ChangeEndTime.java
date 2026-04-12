package bg.tu_varna.sit.f24621743.commandHandling.helperClasses.changeStrategy;

import bg.tu_varna.sit.f24621743.calendar.Event;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ChangeEndTime implements ChangeEvent{
    @Override
    public void apply(Event event, String value) {
        DateTimeFormatter timePattern = DateTimeFormatter.ofPattern("H:mm");
        LocalTime endTime = LocalTime.parse(value, timePattern);
        event.setEndTime(endTime);
    }
}
