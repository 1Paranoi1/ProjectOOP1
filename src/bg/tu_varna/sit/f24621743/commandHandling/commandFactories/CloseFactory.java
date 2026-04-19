package bg.tu_varna.sit.f24621743.commandHandling.commandFactories;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands.CloseCommand;

public class CloseFactory implements CommandFactory{

    @Override
    public CLICommand create(String[] parameters) {
        return new CloseCommand();
    }

    @Override
    public String toString() {
        return ">close - closes currently opened file";
    }
}
