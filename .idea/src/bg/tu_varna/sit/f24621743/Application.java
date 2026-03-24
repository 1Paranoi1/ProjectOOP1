package bg.tu_varna.sit.f24621743;

import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;
import bg.tu_varna.sit.f24621743.commandHandling.CommandHandler;
import bg.tu_varna.sit.f24621743.commandHandling.CommandParsingException;
import bg.tu_varna.sit.f24621743.commandHandling.commands.CommandMap;
import bg.tu_varna.sit.f24621743.userInputHandling.ReadInputException;
import bg.tu_varna.sit.f24621743.userInputHandling.UserInput;

import java.util.Arrays;

//open C:\Temp\File.txt
public class Application {
    static void main(String[] args) {

        boolean isRunning = true;
        UserInput ui = new UserInput();
        CommandHandler cmd = new CommandHandler(new CommandMap());


        do{
            try{
                ui.readInput();
                isRunning = cmd.executeCommand(ui.getCommand(), ui.getParameters());
            }
            catch(ReadInputException | CommandParsingException e){
                System.out.println(e.getMessage());
                continue;
            }

            System.out.println("Command: " + ui.getCommand());
            System.out.println("Parameters: " + Arrays.toString(ui.getParameters()));


        }while(isRunning);
        ui.closeScanner();
        System.out.println("=-(");
    }

}
