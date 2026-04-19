package bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

public class CloseCommand implements CLICommand {
    @Override
    public void action() {

        Calendar.getInstance().clearCalendar();
        Calendar.getInstance().getCommitBuffer().setFile(null);
    }


}
