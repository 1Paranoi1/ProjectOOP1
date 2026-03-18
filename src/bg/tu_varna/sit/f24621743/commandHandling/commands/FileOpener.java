package bg.tu_varna.sit.f24621743.commandHandling.commands;

import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

import java.io.BufferedReader;
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

        StringBuilder sb = new StringBuilder();

        try(FileReader fr = new FileReader(fileLocation)){
            BufferedReader bufferedReader = new BufferedReader(fr);

            while((line = bufferedReader.readLine()) != null) {
                sb.append(line).append(" ");
            }
            CommitBuffer.getInstance().setBuffer(sb);
            sb.setLength(0);

            System.out.println(CommitBuffer.getInstance().getBuffer().toString());

            CommitBuffer.getInstance().setFilePath(fileLocation);
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
