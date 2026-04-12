package bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

public class FileCloser implements CLICommand {
    @Override
    public void action(String[] parameters) {

        Calendar.getInstance().clearCalendar();
        Calendar.getInstance().getCommitBuffer().setFile(null);
    }

    @Override
    public String toString() {
        return ">close - closes currently opened file";
    }
}
