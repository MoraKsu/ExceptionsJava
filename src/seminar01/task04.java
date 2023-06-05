package seminar01;

/*
 * Реализуйте метод, принимающий в качестве аргументов два целочисленных массива, и возвращающий новый массив, каждый
 * элемент которого равен частному элементов двух входящих массивов в той же ячейке. Если длины массивов не равны,
 * необходимо как-то оповестить пользователя. Важно: При выполнении метода единственное исключение, которое пользователь
 *  может увидеть - RuntimeException, т.е. ваше.
 */

public class task04 {
    public static void main(String[] args) {
        divideArrays(new int[]{4, 6, 8, 10}, new int[]{2, 3, 4});
    }

    public static int[] divideArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
            throw new RuntimeException("Длины массивов не равны!");
        }

        int[] result = new int[array1.length];
        for (int i = 0; i < array1.length; i++) {
            if (array2[i] == 0) {
                throw new RuntimeException("Деление на ноль недопустимо!");
            }
            result[i] = array1[i] / array2[i];
        }

        return result;
    }
}
