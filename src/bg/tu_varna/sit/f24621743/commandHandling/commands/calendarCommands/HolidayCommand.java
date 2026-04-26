package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.ActiveCalendar;
import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.Event;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HolidayCommand implements CLICommand {
    private LocalDate date;
    private Calendar calendar;

    public HolidayCommand(LocalDate date, Calendar calendar) {
        this.date = date;
        this.calendar = calendar;
    }

    @Override
    public void action() throws FileNotOpenException {

        for (Event e : calendar.getList()){
            if(e.getDate().equals(date)){
                e.setHoliday(true);
            }
        }
    }
}
