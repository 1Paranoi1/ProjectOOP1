package bg.tu_varna.sit.f24621743.commandHandling.commands;

import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class FileSaving {

    public boolean action(String fileLocation){

        try(PrintWriter pw = new PrintWriter(new FileWriter(fileLocation))) {

            //CommitBuffer.getInstance().appendBuffer("=)");

            pw.print(CommitBuffer.getInstance().getBuffer());
        }
        catch (IOException e){
            System.out.println("Error: No file to save to.");
            return true;
        }
        catch (NullPointerException e){
            System.out.println("Error: File location is null.");
            return true;
        }
        return true;
    }
}
