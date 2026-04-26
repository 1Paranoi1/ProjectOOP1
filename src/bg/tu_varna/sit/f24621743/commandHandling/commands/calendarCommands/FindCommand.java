package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.Event;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.Print;

public class FindCommand implements CLICommand {
    private String target;
    private Calendar calendar;

    public FindCommand(String target, Calendar calendar) {
        this.target = target;
        this.calendar = calendar;
    }

    @Override
    public void action() throws FileNotOpenException {

        for (Event e : calendar.getList()){
            if(e.getName().contains(target) || e.getNote().contains(target)){
                Print.printEvent(e);
            }
        }
    }
}
