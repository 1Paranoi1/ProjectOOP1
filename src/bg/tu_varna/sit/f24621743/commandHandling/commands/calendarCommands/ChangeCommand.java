package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.Event;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.changeStrategy.ChangeEvent;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.changeStrategy.ChangeMap;

import java.time.LocalDate;
import java.time.LocalTime;

public class ChangeCommand implements CLICommand {

    private LocalDate date;
    private LocalTime startTime;
    private String option;
    private String newValue;
    private Calendar calendar;

    public ChangeCommand(LocalDate date, LocalTime startTime, String option, String newValue, Calendar calendar) {
        this.date = date;
        this.startTime = startTime;
        this.option = option;
        this.newValue = newValue;
        this.calendar = calendar;
    }

    @Override
    public void action() throws FileNotOpenException {

        ChangeMap map = new ChangeMap();

        Event event = calendar.findEvent(date, startTime);
        ChangeEvent changeEvent = map.get(option);
        changeEvent.apply(event, newValue);
    }
}
