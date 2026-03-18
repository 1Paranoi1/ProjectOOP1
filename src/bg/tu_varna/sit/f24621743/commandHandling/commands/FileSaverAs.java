package bg.tu_varna.sit.f24621743.commandHandling.commands;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

public class FileSaverAs extends FileSaving implements CLICommand {
    @Override
    public boolean action(String[] parameters) {
        String fileLocation = parameters[0];
        return action(fileLocation);
    }
    @Override
    public String toString() {
        return ">saveAs <file> - saves all the changes into a given file path";
    }
}
