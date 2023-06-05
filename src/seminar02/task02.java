package seminar02;

/*
Если необходимо, исправьте данный код:
try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
 */

public class task02 {
    public static void main(String[] args) {

        // небыл задан массив
        int[] intArray = {2, 5, 6, 3, 7, 5, 9, 1, 4};

        try {
            // на 0 делить нельзя
            int d = 2;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.out.println("Catching exception: " + e);
        }
    }
}
