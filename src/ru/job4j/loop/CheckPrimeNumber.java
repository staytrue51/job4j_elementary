package ru.job4j.loop;

public class CheckPrimeNumber {
    public static boolean check(int number) {
        boolean prime = false;
        number--;
        for (int index = 2; index < number; index++) {
            if ((number % index) == 0) {
                prime = true;
                break;
            }
        }
        return prime;
    }
}
