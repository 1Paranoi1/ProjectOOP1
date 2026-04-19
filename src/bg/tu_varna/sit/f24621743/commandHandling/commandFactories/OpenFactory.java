package bg.tu_varna.sit.f24621743.commandHandling.commandFactories;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands.OpenCommand;

public class OpenFactory implements CommandFactory{

    @Override
    public CLICommand create(String[] parameters) {
        String filePath = parameters[0];
        return new OpenCommand(filePath);
    }
    @Override
    public String toString() {
        return ">open <file> - opens a file at a given file path";
    }
}
