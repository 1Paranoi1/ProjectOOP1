package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;

import java.time.LocalDate;
import java.time.LocalTime;

public class BookCommand implements CLICommand {

    private LocalDate date;
    private LocalTime startTime;
    private LocalTime endTime;
    private String note;
    private String name;

    public BookCommand(LocalDate date, LocalTime startTime, LocalTime endTime, String note, String name) {
        this.date = date;
        this.startTime = startTime;
        this.endTime = endTime;
        this.note = note;
        this.name = name;
    }

    @Override
    public void action() {

        if(Calendar.getInstance().getCommitBuffer().getFile() == null){
            throw new FileNotOpenException("Error: File is not open");
        }
        else{
            Calendar.getInstance().addEvent(date, startTime, endTime, note, name);
        }
    }


}
