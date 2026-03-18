package bg.tu_varna.sit.f24621743.commandHandling.commands;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

public class Helper implements CLICommand {
    @Override
    public boolean action(String[] parameters) {
        System.out.println("""
                The following commands are supported: 
                >open <file> - opens a file at a given file path
                >close - closes currently opened file
                >save - saves all the changes into currently opened file
                >saveAs <file> - saves all the changes into a given file path
                >help - prints this information
                >exit - exists the program""");
        return true;
    }

    @Override
    public String toString() {
        return ">exit - exists the program";
    }
}
