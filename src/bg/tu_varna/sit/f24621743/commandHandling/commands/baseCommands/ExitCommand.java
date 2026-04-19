package bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

public class ExitCommand implements CLICommand {
    @Override
    public void action() {
        System.exit(0);
    }
}
