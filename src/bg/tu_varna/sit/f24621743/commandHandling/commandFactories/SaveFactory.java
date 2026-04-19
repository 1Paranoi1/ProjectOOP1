package bg.tu_varna.sit.f24621743.commandHandling.commandFactories;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands.SaveCommand;

public class SaveFactory implements CommandFactory{

    @Override
    public CLICommand create(String[] parameters) {
        return new SaveCommand();
    }
    @Override
    public String toString() {
        return ">save - saves all the changes into currently opened file";
    }
}
