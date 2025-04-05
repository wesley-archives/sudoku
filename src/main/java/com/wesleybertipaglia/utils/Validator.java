package com.wesleybertipaglia.utils;

public class Validator {
    public static boolean isValid(int[][] board) {
        for (int i = 0; i < 9; i++) {
            boolean[] row = new boolean[9];
            boolean[] col = new boolean[9];
            boolean[] box = new boolean[9];
            for (int j = 0; j < 9; j++) {
                int rowVal = board[i][j];
                int colVal = board[j][i];
                int boxVal = board[(i / 3) * 3 + j / 3][(i % 3) * 3 + j % 3];

                if (rowVal < 1 || rowVal > 9 || row[rowVal - 1]) return false;
                if (colVal < 1 || colVal > 9 || col[colVal - 1]) return false;
                if (boxVal < 1 || boxVal > 9 || box[boxVal - 1]) return false;

                row[rowVal - 1] = col[colVal - 1] = box[boxVal - 1] = true;
            }
        }
        return true;
    }
}
