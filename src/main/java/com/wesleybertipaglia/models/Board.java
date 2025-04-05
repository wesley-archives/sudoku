package com.wesleybertipaglia.models;

import com.wesleybertipaglia.utils.Validator;

public class Board {
    private final Cell[][] cells = new Cell[9][9];

    public Board() {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cells[i][j] = new Cell(0, true);
            }
        }
    }

    public Cell getCell(int row, int col) {
        return cells[row][col];
    }

    public boolean isCompleteAndValid() {
        int[][] current = new int[9][9];
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++)
                current[i][j] = cells[i][j].getValue();

        return Validator.isValid(current);
    }
}
