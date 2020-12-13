package ru.job4j.converter;

public class Converter {

    public static int rubleToEuro(int value) {
        int rsl = value / 70;
        return rsl;
    }

    public static int rubleToDollar(int value) {
        int rsl = value / 60;
        return rsl;
    }

    public static void main(String[] args) {
        int in = 140;
        int in1 = 600;
        int expected = 2;
        int expected1 = 10;
        int out = Converter.rubleToEuro(in);
        int out1 = Converter.rubleToDollar(in1);
        boolean passed = expected == out;
        boolean passed1 = expected1 == out1;
        System.out.println("140 rubles are 2. Test result : " + passed);
        System.out.println("600 rubles are 10. Test result : " + passed1);

    }
}
