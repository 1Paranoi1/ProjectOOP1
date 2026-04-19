package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.Event;
import bg.tu_varna.sit.f24621743.calendar.EventParser;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;

import java.time.LocalDate;
import java.time.LocalTime;


public class UnbookCommand implements CLICommand {

    //Unhandled exception wrong parameters
    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;

    public UnbookCommand(LocalDate date, LocalTime startTime, LocalTime endTime) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    @Override
    public void action() throws FileNotOpenException {

        EventParser eventParser = new EventParser();
        Event target = eventParser.parsEvent(date, startTime, endTime);

        for(Event e : Calendar.getInstance().getList()){
            if(e.equals(target) && e.getEndTime().equals(target.getEndTime())){
                Calendar.getInstance().removeEvent(e);
            }
        }
    }
}
