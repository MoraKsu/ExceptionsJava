package seminar03.views;

import java.util.Scanner;

public class AppView {
    private Scanner scanner;

    public AppView() {
        scanner = new Scanner(System.in);
    }

    public void displayMessage(String message) {
        System.out.println(message);
    }

    public void displayError(String errorMessage) {
        System.err.println(errorMessage);
    }

    public String getInput() {
        return scanner.nextLine();
    }
}
