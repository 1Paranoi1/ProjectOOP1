package bg.tu_varna.sit.f24621743.commandHandling.commands;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

public class Exiter implements CLICommand {
    @Override
    public boolean action(String[] parameters) {

        return false;
    }

    @Override
    public String toString() {
        return ">exit - exists the program";
    }
}
