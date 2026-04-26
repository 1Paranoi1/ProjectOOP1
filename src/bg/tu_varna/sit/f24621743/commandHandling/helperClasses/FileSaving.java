package bg.tu_varna.sit.f24621743.commandHandling.helperClasses;

import bg.tu_varna.sit.f24621743.calendar.ActiveCalendar;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;



public class FileSaving {

    public void save(File file){

        try(PrintWriter pw = new PrintWriter(new FileWriter(file))) {
            pw.print(ActiveCalendar.getActiveCalendar().toString());
        }
        catch (IOException e){
            System.out.println("Error: No file to save to.");
        }
        catch (NullPointerException e){
            System.out.println("Error: File location is null.");
        }
    }
}
