package bg.tu_varna.sit.f24621743.commandHandling.commands;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

public class FileOpener implements CLICommand {
    @Override
    public void action(String[] parameters) {
        System.out.println("Opening file...");
    }
}
