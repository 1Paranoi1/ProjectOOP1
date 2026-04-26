package bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands;

import bg.tu_varna.sit.f24621743.calendar.ActiveCalendar;
import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;

import java.io.FileNotFoundException;

public class CloseCommand implements CLICommand {
    @Override
    public void action() throws FileNotOpenException {
        Calendar calendar = ActiveCalendar.getActiveCalendar();

        calendar.clearCalendar();
        ActiveCalendar.setActiveCalendar(null);
    }


}
