package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.Event;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.Print;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class AgendaCommand implements CLICommand {
    private LocalDate date;
    private Calendar calendar;

    public AgendaCommand(LocalDate date, Calendar calendar) {
        this.date = date;
        this.calendar = calendar;
    }

    @Override
    public void action() throws FileNotOpenException {
        List<Event> dateEvents = new ArrayList<Event>();

        for (Event e : calendar.getList()){
            if(e.getDate().equals(date)){
               dateEvents.add(e);
            }
        }
        dateEvents.sort(Comparator.comparing(Event::getStartTime));
        Print.printEvents(dateEvents);
    }
}
