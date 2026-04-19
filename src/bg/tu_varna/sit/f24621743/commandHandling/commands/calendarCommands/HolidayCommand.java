package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.Event;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HolidayCommand implements CLICommand {
    private LocalDate date;

    public HolidayCommand(LocalDate date) {
        this.date = date;
    }

    @Override
    public void action() throws FileNotOpenException {

        for (Event e : Calendar.getInstance().getList()){
            if(e.getDate().equals(date)){
                e.setHoliday(true);
            }
        }
    }
}
