package bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

public class Exiter implements CLICommand {
    @Override
    public void action(String[] parameters) {
        System.exit(0);
    }

    @Override
    public String toString() {
        return ">exit - exists the program";
    }
}
