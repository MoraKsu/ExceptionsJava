package seminar02;

/*
Дан следующий код, исправьте его там, где требуется:
public static void main(String[] args) throws Exception {
   try {
       int a = 90;
       int b = 3;
       System.out.println(a / b);
       printSum(23, 234);
       int[] abc = { 1, 2 };
       abc[3] = 9;
   } catch (Throwable ex) {
       System.out.println("Что-то пошло не так...");
   } catch (NullPointerException ex) {
       System.out.println("Указатель не может указывать на null!");
   } catch (IndexOutOfBoundsException ex) {
       System.out.println("Массив выходит за пределы своего размера!");
   }
}
public static void printSum(Integer a, Integer b) throws FileNotFoundException {
   System.out.println(a + b);
}

 */

public class task03 {
    public static void main(String[] args) throws Exception {
        try {
            int a = 90;
            int b = 3;
            System.out.println(a / b);
            printSum(23, 234);

            // int[] abc = { 1, 2 };
            // Была задана маленькая длинна
            int[] abc = {1, 2, 3, 4};
            abc[3] = 9;

            // Былы задана не верная иерархия перехвата ошибки

        } catch (NullPointerException ex) {
            System.out.println("Указатель не может указывать на null!");
        } catch (IndexOutOfBoundsException e) {
            System.out.println("Массив выходит за пределы своего размера!");
        } catch (Throwable ex) {
            System.out.println("Что-то пошло не так...");
        }
    }

    // Указан не верный Exception
    public static void printSum(Integer a, Integer b) throws ArithmeticException {
        System.out.println(a + b);
    }
}
