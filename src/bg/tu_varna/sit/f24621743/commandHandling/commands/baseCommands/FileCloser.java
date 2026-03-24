package bg.tu_varna.sit.f24621743.commandHandling.commands.baseCommands;

import bg.tu_varna.sit.f24621743.commitHandling.CommitBuffer;
import bg.tu_varna.sit.f24621743.commandHandling.CLICommand;

public class FileCloser implements CLICommand {
    @Override
    public boolean action(String[] parameters) {
        CommitBuffer.getInstance().getBuffer().setLength(0);
        CommitBuffer.getInstance().setFile(null);
        return true;
    }

    @Override
    public String toString() {
        return ">close - closes currently opened file";
    }
}
