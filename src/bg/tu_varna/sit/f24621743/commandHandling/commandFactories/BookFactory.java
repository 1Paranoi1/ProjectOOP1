package bg.tu_varna.sit.f24621743.commandHandling.commandFactories;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands.BookCommand;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class BookFactory implements CommandFactory{
    DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yy");
    DateTimeFormatter timePattern = DateTimeFormatter.ofPattern("H:mm");

    @Override
    public CLICommand create(String[] parameters) {
        LocalDate date = LocalDate.parse(parameters[0], datePattern);
        LocalTime startTime = LocalTime.parse(parameters[1], timePattern);
        LocalTime endTime = LocalTime.parse(parameters[2], timePattern);
        String note = parameters[3];
        String name = parameters[3];
        return new BookCommand(date, startTime, endTime, note, name);
    }

    @Override
    public String toString() {
        return ">book <date> <startTime> <endTime> <name> <description> - books an event in the calendar";
    }
}
