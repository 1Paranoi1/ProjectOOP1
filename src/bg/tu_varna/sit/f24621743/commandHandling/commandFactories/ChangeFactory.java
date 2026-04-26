package bg.tu_varna.sit.f24621743.commandHandling.commandFactories;

import bg.tu_varna.sit.f24621743.calendar.ActiveCalendar;
import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands.ChangeCommand;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class ChangeFactory implements CommandFactory{

    @Override
    public CLICommand create(String[] parameters) {
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter timePattern = DateTimeFormatter.ofPattern("H:mm");

        LocalDate date = LocalDate.parse(parameters[0], datePattern);
        LocalTime startTime = LocalTime.parse(parameters[1], timePattern);
        String option = parameters[2];
        String newValue = parameters[3];
        Calendar calendar = ActiveCalendar.getActiveCalendar();

        return new ChangeCommand(date, startTime, option, newValue, calendar);
    }
    @Override
    public String toString() {
        return ">change <date> <startTime> <option> <newValue> - changes one of date, startTime, endTime, name, note to a newValue";
    }
}
