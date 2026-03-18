package bg.tu_varna.sit.f24621743.commandHandling.commands;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.CommandParsingException;

import java.util.HashMap;
import java.util.Map;

public class CommandMap {
    private final Map<String, CLICommand> commandmap;

    public CommandMap() {
        commandmap = new HashMap<>();

        commandmap.put("open", new FileOpener());
        commandmap.put("close", new FileCloser());
        commandmap.put("save", new FileSaver());
        commandmap.put("saveas", new FileSaverAs());
        commandmap.put("help", new Helper());
        commandmap.put("exit", new Exiter());
    }

    public CLICommand getCommand(String commandName) throws CommandParsingException {
        if (!commandmap.containsKey(commandName)) {
            throw new CommandParsingException("Error: No such command");
        }
        return commandmap.get(commandName);
    }

}
