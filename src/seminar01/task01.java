package seminar01;

// Реализуйте 3 метода, чтобы в каждом из них получить разные исключения

public class task01 {
    public static void main(String[] args) {
//        divide(3,0);
//        getValue(new int[]{1, 2, 3}, 3);
        createArray(-1);
    }

    public static int divide(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Деление на ноль недопустимо!");
        }
        return a / b;
    }


    public static int getValue(int[] array, int index) {
        if (index > array.length) {
            throw new IndexOutOfBoundsException("Индекс не может быть за пределами массива!");
        }
        return array[index];
    }

    public static int[] createArray(int size) {
        if (size < 0) {
            throw new NegativeArraySizeException("Размер массивы не может быть отрицательным!");
        }
        return new int[size];
    }
}
