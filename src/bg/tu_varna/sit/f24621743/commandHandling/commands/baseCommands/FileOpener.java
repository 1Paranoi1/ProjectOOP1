package bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.EventParser;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.FileCreating;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.Print;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating.DateValidator;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating.TimeValidator;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating.Validator;
import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;

//opening a file that doesn't exist does not create one
public class FileOpener implements CLICommand {

    private String fileLocation;

    @Override
    public void action(String[] parameters) {
        try{
            fileLocation = parameters[0];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: No file path provided");
        }

        StringBuilder stringBuilder = new StringBuilder();
        FileCreating fc = new FileCreating(fileLocation);
        File file = fc.createFile();

        try(FileReader fileReader = new FileReader(file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;
            while((line = bufferedReader.readLine()) != null) {
                Calendar.getInstance().addEvent(line.split(" "));
            }

            Calendar.getInstance().getCommitBuffer().setFile(file);
            Print.printEvents(Calendar.getInstance().getList());
            bufferedReader.close();

        }catch(IOException | ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Wrong file path");
        }
    }

    @Override
    public String toString() {
        return ">open <file> - opens a file at a given file path";
    }
}
