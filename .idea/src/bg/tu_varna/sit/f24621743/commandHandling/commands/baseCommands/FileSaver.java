package bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands;

import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.FileSaving;
import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

import java.io.File;


public class FileSaver extends FileSaving implements CLICommand {
    @Override
    public boolean action(String[] parameters) {
        File file = CommitBuffer.getInstance().getFile();
        return save(file);
    }

    @Override
    public String toString() {
        return ">save - saves all the changes into currently opened file";
    }
}
