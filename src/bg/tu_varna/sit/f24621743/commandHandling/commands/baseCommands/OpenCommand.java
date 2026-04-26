package bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands;

import bg.tu_varna.sit.f24621743.calendar.ActiveCalendar;
import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.CalendarManager;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.FileCreating;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.Print;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;

//opening a file that doesn't exist does not create one
public class OpenCommand implements CLICommand {

    private String fileLocation;

    @Override
    public void action() {

        FileCreating fc = new FileCreating(fileLocation);
        File file = fc.createFile();

        try(FileReader fileReader = new FileReader(file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            Calendar calendar = CalendarManager.getCalendar(file);
            ActiveCalendar.setActiveCalendar(calendar);

            String line;
            while((line = bufferedReader.readLine()) != null) {
                calendar.addEvent(line.split(" "));
            }

            Print.printEvents(calendar.getList());
            bufferedReader.close();

        }catch(IOException | ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Wrong file path");
        }
    }

    public OpenCommand(String fileLocation) {
        this.fileLocation = fileLocation;
    }


}
