package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.Event;
import bg.tu_varna.sit.f24621743.calendar.EventParser;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating.DateValidator;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating.FormatException;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating.TimeValidator;

public class Unbooker implements CLICommand {

    //Unhandled exception wrong parameters

    @Override
    public void action(String[] parameters) throws FileNotOpenException {

        EventParser eventParser = new EventParser();

        try{
            Event target = eventParser.parsEvent(parameters);

            for(Event e : Calendar.getInstance().getList()){
                if(e.equals(target) && e.getEndTime().equals(target.getEndTime())){
                    Calendar.getInstance().removeEvent(e);
                }
            }

        }catch(FormatException e){
            System.out.println(e.getMessage());
        }
    }
}
