package Prac1_extra_part2;

public class Rectangle {
    private double width;
    private double height;

    public Rectangle() {
        this.width = -1;
        this.height = -1;
    }

    public Rectangle(double width, double height) {
        this.width = width;
        this.height = height;
    }

    public double getArea() {
        return width * height;
    }

    public double getPerimeter() {
        return 2 * (width + height);
    }

    public double getWidth() { return width; }
    public double getHeight() { return height; }
}

// Клиентский класс
class TestRectangle {
    public static void main(String[] args) {
        Rectangle r1 = new Rectangle(4, 40);
        Rectangle r2 = new Rectangle(3.5, 35.9);

        System.out.println("Прямоугольник 1:");
        System.out.println("Ширина: " + r1.getWidth());
        System.out.println("Высота: " + r1.getHeight());
        System.out.println("Площадь: " + r1.getArea());
        System.out.println("Периметр: " + r1.getPerimeter());
        System.out.println();

        System.out.println("Прямоугольник 2:");
        System.out.println("Ширина: " + r2.getWidth());
        System.out.println("Высота: " + r2.getHeight());
        System.out.println("Площадь: " + r2.getArea());
        System.out.println("Периметр: " + r2.getPerimeter());
    }
}
