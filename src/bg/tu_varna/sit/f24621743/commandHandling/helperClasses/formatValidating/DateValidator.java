package bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating;

public class DateValidator implements Validator {

    // 06/04/26
    @Override
    public boolean validate(String parameter) {
        String[] date = parameter.split("/");
        if (date.length == 3 ) {
            if(Integer.parseInt(date[0]) > 31 || Integer.parseInt(date[0]) < 1) {
                throw new FormatException("Error: Invalid day. Use day/month/year format ");
            }
            if(Integer.parseInt(date[1]) > 12  || Integer.parseInt(date[1]) < 1) {
                throw new FormatException("Error: Invalid month. Use day/month/year format ");
            }
            if(Integer.parseInt(date[2]) < 0){
                throw new FormatException("Error: Invalid year. Use day/month/year format ");
            }
        }
        else{
            throw new FormatException("Error: Invalid date. Use day/month/year format ");
        }
        return true;
    }
}
