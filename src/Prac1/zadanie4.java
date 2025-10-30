package Prac1;


public class zadanie4 {
    public static void main(String[] args) {
        System.out.println("Первые 10 чисел гармонического ряда:");

        for (int i = 1; i <= 10; i++) {
            double h = 1.0 / i;
            System.out.printf("H%d = %.4f%n", i, h);
        }
    }
}
