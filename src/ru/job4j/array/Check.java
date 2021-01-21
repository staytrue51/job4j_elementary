package ru.job4j.array;

public class Check {
    public static boolean mono(boolean[] data) {
        boolean result = true;
        for (int index = 0; index < data.length; index++) {
            if (data[index] == data[1] && data[0] == data[2]) {
                result = true;
                break;
            } else {
                result = false;
                break;
            }
        }
        return result;
    }
}

