package bg.tu_varna.sit.f24621743.commandHandling.commandFactories;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

public interface CommandFactory {
    CLICommand create(String[] parameters);
}
