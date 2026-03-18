package bg.tu_varna.sit.f24621743.commandHandling.commands;

import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;


public class FileSaver extends FileSaving implements CLICommand {
    @Override
    public boolean action(String[] parameters) {
        String fileLocation = CommitBuffer.getInstance().getFilePath();
        return action(fileLocation);
    }

    @Override
    public String toString() {
        return ">save - saves all the changes into currently opened file";
    }
}
