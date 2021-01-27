package ru.job4j.array;

public class MatrixCheck {
    public static boolean monoHorizontal(char[][] board, int row) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[row][cell] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static boolean monoVertical(char[][] board, int column) {
        boolean result = true;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[cell][column] != 'X') {
                result = false;
                break;
            }
        }
        return result;
    }

    public static char[] extractDiagonal(char[][] board) {
        char[] rsl = new char[board.length];
        for (int cell = 0; cell < board.length; cell++) {
            rsl[cell] = board[cell][cell];
        }
        return rsl;
    }

    public static boolean isWin(char[][] board) {
        boolean result = false;
        for (int cell = 0; cell < board.length; cell++) {
            if (board[cell][cell] == 'X') {
                if (monoHorizontal(board, cell) || monoVertical(board, cell)) {
                    result = true;
                    break;
                }
            }
        }
        return result;
    }
}