package bg.tu_varna.sit.f24621743.userInputHandling;

import java.util.Arrays;
import java.util.Scanner;

public class UserInput {
    private String[] command;
    private final Scanner scanner;

    public UserInput() {
        scanner = new Scanner(System.in);
    }

    public void readInput() throws ReadInputException{
        String prompt = scanner.nextLine();

        if (prompt.trim().isEmpty()) {
            throw new ReadInputException("Inappropriate user input");
        }
        command = prompt.split(" ");

    }

    public String getCommand() {
        return command[0].toLowerCase();
    }

    public String[] getParameters() {
        String[] params = new String[command.length - 1];
        for (int i = 0; i < command.length-1; i++) {
            params[i] = command[i + 1].trim();
        }
        return params;
    }

    public void closeScanner(){
        scanner.close();
    }
}
