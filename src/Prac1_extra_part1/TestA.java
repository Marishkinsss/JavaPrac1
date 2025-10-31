package Prac1_extra_part1;

public class TestA {
    public static void main(String[] args) {
        A a = new A("Привет");
        a.print();  // Выведет: Привет

        A b = new A();
        b.print();  // Выведет: default
    }
}
