package bg.tu_varna.sit.f24621743.commandHandling;

import bg.tu_varna.sit.f24621743.commandHandling.commands.CommandMap;

public class CommandHandler {
    private final CommandMap commandMap;

    public CommandHandler(CommandMap commandMap) {
        this.commandMap = commandMap;
    }

    public void executeCommand(String commandPrompt, String[] parameters) {
           commandMap.getCommand(commandPrompt).action(parameters);
    }

}
