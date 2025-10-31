package Prac1_extra_part2;

public class Stock {
    private String symbol;
    private String name;
    private double previousClosingPrice;
    private double currentPrice;

    public Stock(String symbol, String name) {
        this.symbol = symbol;
        this.name = name;
    }

    public void setPreviousClosingPrice(double price) {
        this.previousClosingPrice = price;
    }

    public void setCurrentPrice(double price) {
        this.currentPrice = price;
    }

    public double getChangePercent() {
        return ((currentPrice - previousClosingPrice) / previousClosingPrice) * 100;
    }

    public String getSymbol() { return symbol; }
    public String getName() { return name; }
    public double getPreviousClosingPrice() { return previousClosingPrice; }
    public double getCurrentPrice() { return currentPrice; }
}

class TestStock {
    public static void main(String[] args) {
        Stock sber = new Stock("SBER", "ПАО Сбербанк");
        sber.setPreviousClosingPrice(281.50);
        sber.setCurrentPrice(282.87);

        System.out.println("Акция: " + sber.getName() + " (" + sber.getSymbol() + ")");
        System.out.println("Цена закрытия предыдущего дня: " + sber.getPreviousClosingPrice());
        System.out.println("Текущая цена: " + sber.getCurrentPrice());
        System.out.printf("Процент изменения: %.2f%%\n", sber.getChangePercent());
    }
}
