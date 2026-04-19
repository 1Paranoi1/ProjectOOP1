package bg.tu_varna.sit.f24621743.commandHandling.commandFactories;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands.HelpCommand;

public class HelpFactory implements CommandFactory{

    @Override
    public CLICommand create(String[] parameters) {
        return new HelpCommand();
    }
    @Override
    public String toString() {
        return ">help - shows the description of all of the commands";
    }
}
