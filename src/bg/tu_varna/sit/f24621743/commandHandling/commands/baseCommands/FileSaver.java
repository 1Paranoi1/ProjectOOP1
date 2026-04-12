package bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.FileSaving;
import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

import java.io.File;


public class FileSaver extends FileSaving implements CLICommand {
    @Override
    public void action(String[] parameters) {

        try{
            File file = Calendar.getInstance().getCommitBuffer().getFile();
            save(file);
        }catch(FileNotOpenException e){
            System.out.println(e.getMessage());
        }
    }

    @Override
    public String toString() {
        return ">save - saves all the changes into currently opened file";
    }
}
