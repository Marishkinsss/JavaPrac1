package Prac1;


public class zadanie3 {
    public static void main(String[] args) {
        System.out.println("Аргументы командной строки:");

        for (int i = 0; i < args.length; i++) {
            System.out.println("Аргумент " + (i + 1) + ": " + args[i]);
        }

        if (args.length == 0) {
            System.out.println("Нет аргументов. Передайте их при запуске программы.");
        }
    }
}
