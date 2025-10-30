package Prac1;


import java.math.BigInteger;
import java.util.Scanner;

public class zadanie5 {

    // Метод вычисления факториала с BigInteger
    public static BigInteger factorial(int n) {
        BigInteger result = BigInteger.ONE;
        for (int i = 2; i <= n; i++) {
            result = result.multiply(BigInteger.valueOf(i));
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число для вычисления факториала: ");
        int num = sc.nextInt();

        BigInteger fact = factorial(num);
        System.out.println("Факториал числа " + num + " = " + fact);
    }
}

