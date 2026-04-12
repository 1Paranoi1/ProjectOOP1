package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.Event;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.Print;

public class FindCommand implements CLICommand {
    @Override
    public void action(String[] parameters) throws FileNotOpenException {

        String target = parameters[0];

        for (Event e : Calendar.getInstance().getList()){
            if(e.getName().equals(target) || e.getNote().equals(target)){
                Print.printEvent(e);
            }
        }
    }
}
