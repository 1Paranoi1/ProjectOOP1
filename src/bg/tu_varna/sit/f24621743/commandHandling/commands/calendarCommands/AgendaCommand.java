package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.Event;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.Print;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating.DateValidator;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class AgendaCommand implements CLICommand {

    private List<Event> dateEvents = new ArrayList<Event>();
    @Override
    public void action(String[] parameters) throws FileNotOpenException {

        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate date = LocalDate.parse(parameters[0], datePattern);

        for (Event e : Calendar.getInstance().getList()){
            if(e.getDate().equals(date)){
               dateEvents.add(e);
            }
        }
        dateEvents.sort(Comparator.comparing(Event::getStartTime));
        Print.printEvents(dateEvents);
    }
}
