package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
        double p = (a + b + c) / 2;
        double rslPA = (p - a);
        double rslPB = (p - b);
        double rslPC = (p - c);
        double rsl = p * rslPA * rslPB * rslPC;
        double s = Math.sqrt(rsl);
        return s;
    }

    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
    }
}
