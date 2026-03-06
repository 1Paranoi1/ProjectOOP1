package bg.tu_varna.sit.f24621743;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.CommandHandler;
import bg.tu_varna.sit.f24621743.commandHandling.commands.FileCloser;
import bg.tu_varna.sit.f24621743.commandHandling.commands.FileOpener;
import bg.tu_varna.sit.f24621743.userInputHandling.ReadInputException;
import bg.tu_varna.sit.f24621743.userInputHandling.UserInput;

import java.util.Arrays;

//open C:\Temp\File.txt
public class Application {
    static void main(String[] args) {

        boolean isRunning = true;
        UserInput sr = new UserInput();
        CommandHandler cmd = new CommandHandler();

        CLICommand open = new FileOpener();
        CLICommand close = new FileCloser();

        do{
            try{
                sr.readInput();
            }
            catch(ReadInputException e){
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("Command: " + sr.getCommand());
            System.out.println("Parameters: " + Arrays.toString(sr.getParameters()));

            switch(sr.getCommand()){
                case "open":
                    cmd.setParameters(sr.getParameters());
                    cmd.doCommand(open);
                    break;
                case "close":
                    cmd.setParameters(sr.getParameters());
                    cmd.doCommand(close);
                    break;
                case "exit":
                    isRunning = false;
                    break;
            }
        }while(isRunning);
        sr.closeScanner();
    }
}
