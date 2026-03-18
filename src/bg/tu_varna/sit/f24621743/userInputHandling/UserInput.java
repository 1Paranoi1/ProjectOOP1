package bg.tu_varna.sit.f24621743.userInputHandling;

import java.util.Scanner;

public class UserInput implements StringReader {
    private String[] command;
    private final Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    @Override
    public String readInput() throws ReadInputException{
        String prompt = scanner.nextLine();

        if (prompt.trim().isEmpty()) {
            throw new ReadInputException("Inappropriate user input");
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
