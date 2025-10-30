package Prac1;


import java.util.Scanner;

public class zadanie2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Введите количество элементов массива: ");
        int n = sc.nextInt();

        int[] arr = new int[n];
        System.out.println("Введите элементы массива:");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int i = 0;
        int sum = 0;
        do {
            sum += arr[i];
            i++;
        } while (i < n);

        int min = arr[0];
        int max = arr[0];
        int j = 1;
        while (j < n) {
            if (arr[j] < min) min = arr[j];
            if (arr[j] > max) max = arr[j];
            j++;
        }

        System.out.println("\nСумма элементов: " + sum);
        System.out.println("Минимум: " + min);
        System.out.println("Максимум: " + max);
    }
}
