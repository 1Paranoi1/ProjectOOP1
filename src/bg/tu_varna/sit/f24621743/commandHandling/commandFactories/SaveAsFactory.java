package bg.tu_varna.sit.f24621743.commandHandling.commandFactories;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands.OpenCommand;

public class SaveAsFactory implements CommandFactory{

    @Override
    public CLICommand create(String[] parameters) {
        String filePath = parameters[0];
        return new OpenCommand(filePath);
    }
    @Override
    public String toString() {
        return ">saveAs <file> - saves all the changes into a given file path";
    }
}
// book 19/04/26 22:18 23:18 1 1
// book 20/04/26 8:00 15:00 2 2