package seminar02;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение.
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить у
пользователя ввод данных.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class task01 {
    public static float getUserFloatInput() {
        Scanner scanner = new Scanner(System.in);
        float input = 0;
        boolean isValidInput = false;

        do {
            try {
                System.out.print("Введите дробное число: ");
                input = scanner.nextFloat();
                isValidInput = true;
            } catch (InputMismatchException e) {
                System.out.println("Ошибка: Введено неверное значение! Пожалуйста, введите дробное число.");
                scanner.nextLine(); // Очистка буфера ввода
                isValidInput = false;
            }
        } while (!isValidInput);

        scanner.close();
        return input;
    }
}
