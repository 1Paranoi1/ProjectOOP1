package bg.tu_varna.sit.f24621743.userInputHandling;

import java.util.Scanner;

public class UserInput implements StringReader {
    private String prompt;
    String[] command;
    Scanner scanner;

    public UserInput() {
        prompt = "";
        scanner = new Scanner(System.in);
    }

    @Override
    public String readInput() throws ReadInputException{
        prompt = scanner.nextLine();

        if (prompt.trim().isEmpty()) {
            //scanner.close();
            throw new ReadInputException("Inappropriate command");
        }
        command = prompt.split(" ");

        return prompt;
    }

    public String getCommand() {
        return command[0].toLowerCase();
    }

    public String[] getParameters() {
        if(command.length > 1){
            return command[1].split(",");
        }
        return new String[0];
    }

    public void closeScanner(){
        scanner.close();
    }
}
