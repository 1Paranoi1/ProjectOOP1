package bg.tu_varna.sit.f24621743.commandHandling.helperClasses.changeStrategy;

import bg.tu_varna.sit.f24621743.calendar.Event;

public class ChangeNote implements ChangeEvent{
    @Override
    public void apply(Event event, String value) {
        event.setNote(value);
    }
}
