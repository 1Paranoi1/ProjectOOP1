package bg.tu_varna.sit.f24621743.commandHandling.helperClasses;

import java.io.File;
import java.io.IOException;

public class FileCreating {

    private String fileLocation;

    public FileCreating(String fileLocation) {
        this.fileLocation = fileLocation;
    }

    public File createFile() {
        try {
            File myFile = new File(fileLocation);

            if (!myFile.exists()) {
                myFile.createNewFile();
            }
            return myFile;

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

}
