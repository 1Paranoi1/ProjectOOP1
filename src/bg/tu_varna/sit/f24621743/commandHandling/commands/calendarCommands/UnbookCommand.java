package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.ActiveCalendar;
import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.Event;
import bg.tu_varna.sit.f24621743.calendar.EventParser;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;

import java.io.FileNotFoundException;
import java.time.LocalDate;
import java.time.LocalTime;


public class UnbookCommand implements CLICommand {

    //Unhandled exception wrong parameters
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private Calendar calendar;

    public UnbookCommand(LocalDate date, LocalTime startTime, LocalTime endTime, Calendar calendar) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.calendar = calendar;
    }

    @Override
    public void action() throws FileNotOpenException {


        EventParser eventParser = new EventParser();
        Event target = eventParser.parsEvent(date, startTime, endTime);

        for(Event e : calendar.getList()){
            if(e.equals(target) && e.getEndTime().equals(target.getEndTime())){
                calendar.removeEvent(e);
            }
        }
    }
}
