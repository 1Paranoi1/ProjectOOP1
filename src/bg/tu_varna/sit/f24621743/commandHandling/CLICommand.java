package bg.tu_varna.sit.f24621743.commandHandling;

import java.io.FileNotFoundException;

public interface CLICommand {
    void action() throws FileNotOpenException;
}
