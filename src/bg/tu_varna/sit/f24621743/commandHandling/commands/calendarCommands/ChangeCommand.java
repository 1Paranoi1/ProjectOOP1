package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.Event;
import bg.tu_varna.sit.f24621743.calendar.EventParser;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.changeStrategy.ChangeEvent;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.changeStrategy.ChangeMap;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ChangeCommand implements CLICommand {
    @Override
    public void action(String[] parameters) throws FileNotOpenException {

        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter timePattern = DateTimeFormatter.ofPattern("H:mm");

        ChangeMap map = new ChangeMap();

        String date = parameters[0];
        String startTime = parameters[1];
        String option = parameters[2];
        String newValue = parameters[3];

        Event event = Calendar.getInstance().findEvent(LocalDate.parse(date, datePattern), LocalTime.parse(startTime, timePattern));
        ChangeEvent changeEvent = map.get(option);
        changeEvent.apply(event, newValue);
    }
}
