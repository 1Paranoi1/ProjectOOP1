package bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands;

import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.FileSaving;

import java.io.File;

public class SaveAsCommand extends FileSaving implements CLICommand {

    private String fileLocation;

    public SaveAsCommand(String filePath) {
        this.fileLocation = filePath;
    }

    @Override
    public void action() {

        File file = new File(fileLocation);

        try{
            save(file);
        } catch (FileNotOpenException e) {
            System.out.println(e.getMessage());
        }
    }
}
