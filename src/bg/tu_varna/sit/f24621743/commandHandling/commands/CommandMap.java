package bg.tu_varna.sit.f24621743.commandHandling.commands;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.CommandParsingException;
import bg.tu_varna.sit.f24621743.commandHandling.commandFactories.*;
import bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands.*;
import bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands.*;

import java.util.HashMap;
import java.util.Map;

public class CommandMap {
    private final Map<String, CommandFactory> commandmap;

    public CommandMap() {
        commandmap = new HashMap<>();

        commandmap.put("open", new OpenFactory());
        commandmap.put("close", new CloseFactory());
        commandmap.put("save", new SaveFactory());
        commandmap.put("saveas", new SaveAsFactory());
        commandmap.put("help", new HelpFactory());
        commandmap.put("exit", new ExitFactory());

        commandmap.put("book", new BookFactory());
        commandmap.put("unbook", new UnbookFactory());
        commandmap.put("agenda", new AgendaFactory());
        commandmap.put("holiday", new HolidayFactory());
        commandmap.put("find", new FindFactory());
        commandmap.put("change", new ChangeFactory());

    }

    public CommandFactory getCommand(String commandName) throws CommandParsingException {
        if (!commandmap.containsKey(commandName)) {
            throw new CommandParsingException("ERROR| No such command");
        }
        return commandmap.get(commandName);
    }

    public Map<String, CommandFactory> getCommandmap() {
        return new HashMap<>(commandmap);
    }
}
