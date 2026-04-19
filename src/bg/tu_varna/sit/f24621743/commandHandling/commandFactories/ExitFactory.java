package bg.tu_varna.sit.f24621743.commandHandling.commandFactories;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands.ExitCommand;

public class ExitFactory implements CommandFactory{
    @Override
    public CLICommand create(String[] parameters) {
        return new ExitCommand();
    }
    @Override
    public String toString() {
        return ">exit - exists the program";
    }
}
