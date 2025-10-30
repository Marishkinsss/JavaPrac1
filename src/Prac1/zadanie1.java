package Prac1;


public class zadanie1 {
    public static void main(String[] args) {
        int[] numbers = {2, 4, 6, 8, 10};
        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }

        double average = (double) sum / numbers.length;

        System.out.println("Сумма элементов массива: " + sum);
        System.out.println("Среднее арифметическое: " + average);
    }
}
