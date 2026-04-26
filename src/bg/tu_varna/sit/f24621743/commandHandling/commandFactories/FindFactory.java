package bg.tu_varna.sit.f24621743.commandHandling.commandFactories;

import bg.tu_varna.sit.f24621743.calendar.ActiveCalendar;
import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands.FindCommand;

public class FindFactory implements CommandFactory{

    @Override
    public CLICommand create(String[] parameters) {
        String target = parameters[0];
        Calendar calendar = ActiveCalendar.getActiveCalendar();
        return new FindCommand(target, calendar);
    }
    @Override
    public String toString() {
        return ">find <string> - returns all events with a given string in the name or the note";
    }
}
