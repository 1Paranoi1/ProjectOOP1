package bg.tu_varna.sit.f24621743.commandHandling.helperClasses.formatValidating;

import bg.tu_varna.sit.f24621743.commandHandling.FileNotOpenException;

public interface Validator {
    boolean validate(String parameter) throws FormatException;
}
