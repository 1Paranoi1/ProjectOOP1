package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.Event;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.changeStrategy.ChangeEvent;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.changeStrategy.ChangeMap;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ChangeCommand implements CLICommand {

    LocalDate date;
    LocalTime startTime;
    String option;
    String newValue;

    public ChangeCommand(LocalDate date, LocalTime startTime, String option, String newValue) {
        this.date = date;
        this.startTime = startTime;
        this.option = option;
        this.newValue = newValue;
    }

    @Override
    public void action() throws FileNotOpenException {

        ChangeMap map = new ChangeMap();

        Event event = Calendar.getInstance().findEvent(date, startTime);
        ChangeEvent changeEvent = map.get(option);
        changeEvent.apply(event, newValue);
    }
}
