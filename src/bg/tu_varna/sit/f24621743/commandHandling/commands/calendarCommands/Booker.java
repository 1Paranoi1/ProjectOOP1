package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.Event;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating.DateValidator;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating.FormatException;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating.TimeValidator;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating.Validator;
import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;

import java.io.File;

public class Booker implements CLICommand {

    @Override
    public void action(String[] parameters) {

        if(Calendar.getInstance().getCommitBuffer().getFile() == null){
            throw new FileNotOpenException("Error: File is not open");
        }
        else{
            Calendar.getInstance().addEvent(parameters);
        }
    }

    @Override
    public String toString() {
        return ">book <date> <startTime> <endTime> <name> <description> - books an event in the calendar";
    }
}
