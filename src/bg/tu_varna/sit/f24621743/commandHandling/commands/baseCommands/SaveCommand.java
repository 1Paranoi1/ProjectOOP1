package bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.FileSaving;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

import java.io.File;


public class SaveCommand extends FileSaving implements CLICommand {
    @Override
    public void action() {

        try{
            File file = Calendar.getInstance().getCommitBuffer().getFile();
            save(file);
        }catch(FileNotOpenException e){
            System.out.println(e.getMessage());
        }
    }


}
