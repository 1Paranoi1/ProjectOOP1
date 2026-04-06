package bg.tu_varna.sit.f24621743.commandHandling.helperClasses;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;
import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class FileSaving {

    public void save(File file){

        if (CommitBuffer.getInstance().getFile() == null) {
            throw new FileNotOpenException ("File is not open");
        }

        try(PrintWriter pw = new PrintWriter(new FileWriter(file))) {

            //CommitBuffer.getInstance().appendBuffer("=)");
            Calendar.getInstance().pushCalendar();
            pw.print(CommitBuffer.getInstance().getBuffer());
        }
        catch (IOException e){
            System.out.println("Error: No file to save to.");
        }
        catch (NullPointerException e){
            System.out.println("Error: File location is null.");
        }
    }
}
