package bg.tu_varna.sit.f24621743.commandHandling.helperClasses.changeStrategy;

import bg.tu_varna.sit.f24621743.calendar.Event;

import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ChangeName implements ChangeEvent{
    @Override
    public void apply(Event event, String value) {
        event.setName(value);
    }
}
