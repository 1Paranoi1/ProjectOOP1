package bg.tu_varna.sit.f24621743.commandHandling;

public class CommandHandler {
    String[] parameters = new String[0];
    public void doCommand(CLICommand command) {
            command.action(parameters);
    }
    public void setParameters(String[] parameters) {
        this.parameters = parameters;
    }
}
