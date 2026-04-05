package bg.tu_varna.sit.f24621743.commandHandling.commands;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.CommandParsingException;
import bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands.*;
import bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands.Booker;

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

        commandmap.put("book", new Booker());

    }

    public CLICommand getCommand(String commandName) throws CommandParsingException {
        if (!commandmap.containsKey(commandName)) {
            throw new CommandParsingException("Error: No such command");
        }
        return commandmap.get(commandName);
    }

    public Map<String, CLICommand> getCommandmap() {
        return new HashMap<>(commandmap);
    }
}
