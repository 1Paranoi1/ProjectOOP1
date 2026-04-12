package bg.tu_varna.sit.f24621743.commandHandling.helperClasses.changeStrategy;

import bg.tu_varna.sit.f24621743.calendar.Event;

public interface ChangeEvent {
    void apply(Event event, String value);
}
