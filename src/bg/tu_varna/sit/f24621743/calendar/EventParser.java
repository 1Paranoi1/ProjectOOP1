package bg.tu_varna.sit.f24621743.calendar;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;

public class EventParser {

    // ArrayIndexOutOfBoundsException
    public Event parsEvent(String[] parameters) {

        String date = parameters[0];
        String startTime = parameters[1];
        String endTime = parameters[2];
        String name = parameters[3];
        String note = parameters[4];
        boolean holiday = parameters[5].equals("holiday");


        DateTimeFormatter datePattern = DateTimeFormatter.ofPattern("dd/MM/yy");
        DateTimeFormatter timePattern = DateTimeFormatter.ofPattern("H:mm");

        try{
            LocalTime localStartTime = LocalTime.parse(startTime, timePattern);
            LocalTime localEndTime = LocalTime.parse(endTime, timePattern);
            LocalDate localDate = LocalDate.parse(date, datePattern);

                return new Event.EventBuilder(localDate, localStartTime )
                        .withEndTime(localEndTime)
                        .withName(name)
                        .withNote(note)
                        .withHoliday(holiday)
                        .build();
        }catch(DateTimeParseException e){
            System.out.println(e.getMessage());
        }
        return null;
    }


    public Event parsEvent(LocalDate date, LocalTime startTime, LocalTime endTime, String name, String note) {
        return new Event.EventBuilder(date, startTime)
                .withEndTime(endTime)
                .withName(name)
                .withNote(note)
                .build();
    }

    public Event parsEvent(LocalDate date, LocalTime startTime, LocalTime endTime) {
        return new Event.EventBuilder(date, startTime)
                .withEndTime(endTime)
                .build();
    }
}
