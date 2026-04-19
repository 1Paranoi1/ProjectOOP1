package bg.tu_varna.sit.f24621743.commandHandling.commandFactories;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands.HolidayCommand;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HolidayFactory implements CommandFactory{
    DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yy");

    @Override
    public CLICommand create(String[] parameters) {
        LocalDate date = LocalDate.parse(parameters[0], datePattern);
        return new HolidayCommand(date);
    }
    @Override
    public String toString() {
        return ">holiday <date> - changes date to a holiday";
    }
}
