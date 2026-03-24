package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.Event;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;

public class Booker implements CLICommand {

    @Override
    public boolean action(String[] parameters) {
        if(CommitBuffer.getInstance().getFile() == null) {
            System.out.println("File not found");
            return true;
        }
        else{
            Event event = new Event(parameters[0], parameters[1], parameters[2], parameters[3], parameters[4]);
            CommitBuffer.getInstance().appendBuffer(event.toString());
            return true;
        }
    }
}
