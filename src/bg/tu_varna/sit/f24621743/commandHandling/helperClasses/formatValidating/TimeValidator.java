package bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating;

public class TimeValidator implements Validator{

    // 23:47
    @Override
    public boolean validate(String parameter) {
        String[] time = parameter.split(":");

        if (time.length == 2 ) {
            if(Integer.parseInt(time[0]) > 24 || Integer.parseInt(time[0]) < 0){
                throw new FormatException("Error: Invalid hour input. Use hour:minute format ");
            }
            if(Integer.parseInt(time[1]) > 60  || Integer.parseInt(time[1]) < 0){
                throw new FormatException("Error: Invalid year input. Use hour:minute format ");
            }
        }
        else{
            throw new FormatException("Error: Invalid time format, use hour:minute format ");

        }
        return true;
    }
}
