package ru.job4j.loop;

public class Mortgage {
    public static int year(int amount, int salary, double percent) {
        int year = 0;
        while (amount > 0) {
            int remains = (int) (amount + (amount * percent));
            amount = (remains - salary);
            year++;
        }
        return year;
    }
}