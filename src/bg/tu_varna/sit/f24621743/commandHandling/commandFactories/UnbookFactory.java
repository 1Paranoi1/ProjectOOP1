package bg.tu_varna.sit.f24621743.commandHandling.commandFactories;

import bg.tu_varna.sit.f24621743.calendar.ActiveCalendar;
import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.CommandParsingException;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;
import bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands.BookCommand;
import bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands.UnbookCommand;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class UnbookFactory implements CommandFactory{
    DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yy");
    DateTimeFormatter timePattern = DateTimeFormatter.ofPattern("H:mm");

    @Override
    public CLICommand create(String[] parameters) {

        Calendar calendar = ActiveCalendar.getActiveCalendar();

        if(calendar.getFile() == null){
            throw new FileNotOpenException("File not open");
        }

        if (parameters.length != 3) {
            throw new CommandParsingException("ERROR| Command unbook requires 3 parameters");
        } else{
            try{
                LocalDate date = LocalDate.parse(parameters[0], datePattern);
                LocalTime startTime = LocalTime.parse(parameters[1], timePattern);
                LocalTime endTime = LocalTime.parse(parameters[2], timePattern);
            }
            catch(DateTimeParseException e){
                throw new CommandParsingException("ERROR| Command unbook requires a valid date/time format");
            }
        }
        LocalDate date = LocalDate.parse(parameters[0], datePattern);
        LocalTime startTime = LocalTime.parse(parameters[1], timePattern);
        LocalTime endTime = LocalTime.parse(parameters[2], timePattern);

        return new UnbookCommand(date, startTime, endTime, calendar);
    }
    @Override
    public String toString() {
        return ">unBook <date> <startTime> <endTime> - cancels the event with a given date, startTime and an endTime";
    }
}
