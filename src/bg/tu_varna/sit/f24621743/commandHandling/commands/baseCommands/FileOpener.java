package bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands;

import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.FileCreating;
import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
//opening a file that doesn't exist does not create one
public class FileOpener implements CLICommand {

    String line;
    String fileLocation;

    @Override
    public boolean action(String[] parameters) {
        try{
            fileLocation = parameters[0];
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: No file path provided");
            return true;
        }

        StringBuilder stringBuilder = new StringBuilder();
        FileCreating fc = new FileCreating(fileLocation);
        File file = fc.createFile();

        try(FileReader fileReader = new FileReader(file)){
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            while((line = bufferedReader.readLine()) != null) {
                stringBuilder.append(line).append('\n');
            }
            CommitBuffer.getInstance().setBuffer(stringBuilder);
            stringBuilder.setLength(0);

            System.out.println(CommitBuffer.getInstance().getBuffer().toString());

            CommitBuffer.getInstance().setFile(file);
            bufferedReader.close();

        }catch(IOException | ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Wrong file path");
            return true;
        }

        return true;
    }

    @Override
    public String toString() {
        return ">open <file> - opens a file at a given file path";
    }
}
