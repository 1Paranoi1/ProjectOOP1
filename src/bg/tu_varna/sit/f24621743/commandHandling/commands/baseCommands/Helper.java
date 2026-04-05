package bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.commands.CommandMap;

import java.util.Map;

public class Helper implements CLICommand {
    @Override
    public void action(String[] parameters) {

        CommandMap commandMap = new CommandMap();

        System.out.println("The following commands are supported: ");
        for (Map.Entry <String, CLICommand> entry : commandMap.getCommandmap().entrySet()) {
            System.out.println(entry.getValue().toString());
        }
    }

    @Override
    public String toString() {
        return ">exit - exists the program";
    }
}
