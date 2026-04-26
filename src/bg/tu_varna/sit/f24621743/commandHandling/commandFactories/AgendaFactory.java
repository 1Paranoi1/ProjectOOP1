package bg.tu_varna.sit.f24621743.commandHandling.commandFactories;

import bg.tu_varna.sit.f24621743.calendar.ActiveCalendar;
import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands.AgendaCommand;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class AgendaFactory implements CommandFactory {

    @Override
    public CLICommand create(String[] parameters) {
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate date = LocalDate.parse(parameters[0], datePattern);
        Calendar calendar = ActiveCalendar.getActiveCalendar();

        return new AgendaCommand(date, calendar);
    }

    @Override
    public String toString() {
        return ">agenda <date>  - returns a chronological list of all events for the day";
    }
}
