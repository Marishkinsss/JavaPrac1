package Prac1_extra_part1;

public class A {
    String s;

    // Конструктор с параметром
    A(String newS) {
        s = newS;
    }

    // Конструктор по умолчанию
    A() {
        s = "default";
    }

    public void print() {
        System.out.print(s);
    }
}
