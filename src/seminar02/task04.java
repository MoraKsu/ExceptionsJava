package seminar02;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. Пользователю должно
показаться сообщение, что пустые строки вводить нельзя.
 */

import java.util.Scanner;

public class task04 {
    public static void getUserInput() {
        int input = 0;
        while (input != 1) {

            Scanner scanner = new Scanner(System.in);
            System.out.print("Введите строку: ");
            String userInput = scanner.nextLine();

            try {
                if (userInput.equals("")) {
                    throw new Exception();
                }
                System.out.println("Вы ввели: " + userInput);
                input = 1;
            } catch (Exception e) {
                {
                    System.out.println("Пустые строки вводить нельзя, попробуйте снова");
                }
            }
        }
    }
}
