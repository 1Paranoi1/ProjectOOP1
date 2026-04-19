package bg.tu_varna.sit.f24621743.commandHandling.commandFactories;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands.BookCommand;
import bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands.UnbookCommand;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;

public class UnbookFactory implements CommandFactory{
    DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yy");
    DateTimeFormatter timePattern = DateTimeFormatter.ofPattern("H:mm");

    @Override
    public CLICommand create(String[] parameters) {
        LocalDate date = LocalDate.parse(parameters[0], datePattern);
        LocalTime startTime = LocalTime.parse(parameters[1], timePattern);
        LocalTime endTime = LocalTime.parse(parameters[2], timePattern);

        return new UnbookCommand(date, startTime, endTime);
    }
    @Override
    public String toString() {
        return ">unBook <date> <startTime> <endTime> - cancels the event with a given date, startTime and an endTime";
    }
}
