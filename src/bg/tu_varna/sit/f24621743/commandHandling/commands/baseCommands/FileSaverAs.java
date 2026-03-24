package bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.FileSaving;
import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;

import java.io.File;

public class FileSaverAs extends FileSaving implements CLICommand {
    @Override
    public boolean action(String[] parameters) {
        String fileLocation = parameters[0];
        if (CommitBuffer.getInstance().getFile() == null) {
            return save(null);
        }
        else {
            File file = new File(fileLocation);
            return save(file);
        }
    }
    @Override
    public String toString() {
        return ">saveAs <file> - saves all the changes into a given file path";
    }
}
