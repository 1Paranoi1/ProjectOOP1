package bg.tu_varna.sit.f24621743.commandHandling.helperClasses.changeStrategy;

import bg.tu_varna.sit.f24621743.calendar.Event;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class ChangeDate implements ChangeEvent {

    @Override
    public void apply(Event event, String value) {
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate localDate = LocalDate.parse(value, datePattern);
        event.setDate(localDate);
    }
}
