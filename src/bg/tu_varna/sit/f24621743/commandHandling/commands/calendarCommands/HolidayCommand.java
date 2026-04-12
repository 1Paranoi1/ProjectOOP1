package bg.tu_varna.sit.f24621743.commandHandling.commands.calendarCommands;

import bg.tu_varna.sit.f24621743.calendar.Calendar;
import bg.tu_varna.sit.f24621743.calendar.Event;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;
import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

public class HolidayCommand implements CLICommand {

    @Override
    public void action(String[] parameters) throws FileNotOpenException {
        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yy");
        LocalDate date = LocalDate.parse(parameters[0], datePattern);


        for (Event e : Calendar.getInstance().getList()){
            if(e.getDate().equals(date)){
                e.setHoliday(true);
            }
        }
    }
}
