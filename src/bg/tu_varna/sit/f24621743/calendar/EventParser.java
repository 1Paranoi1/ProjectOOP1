package bg.tu_varna.sit.f24621743.calendar;

import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating.DateValidator;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating.FormatException;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating.TimeValidator;
import bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating.Validator;
import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;

public class EventParser {

    private Validator dateValidator = new DateValidator();
    private Validator timeValidator = new TimeValidator();

    public Event parsEvent(String[] parameters) {
        String date = parameters[0];
        String starTime = parameters[1];
        String endTime = parameters[2];
        String name = parameters[3];
        String location = parameters[4];

        try{
            dateValidator.validate(date);
            timeValidator.validate(starTime);
            timeValidator.validate(endTime);

            return new Event(date,starTime,endTime,name,location);
            //CommitBuffer.getInstance().appendBuffer(event.toString());

        }catch(FormatException e){
            System.out.println(e.getMessage());
        }
        return null;
    }
}
