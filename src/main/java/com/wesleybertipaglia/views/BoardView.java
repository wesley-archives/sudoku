package com.wesleybertipaglia.views;

import com.wesleybertipaglia.models.Board;

import javax.swing.*;
import java.awt.*;

public class BoardView extends JPanel {
    private final CellView[][] components = new CellView[9][9];
    private final Board board;

    public BoardView(Board board) {
        this.board = board;
        setLayout(new GridLayout(9, 9));

        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                CellView field = new CellView(i, j);
                components[i][j] = field;
                add(field);
            }
        }
    }

    public void updateBoardFromUI() {
        for (int i = 0; i < 9; i++)
            for (int j = 0; j < 9; j++) {
                try {
                    int val = Integer.parseInt(components[i][j].getText());
                    board.getCell(i, j).setValue(val);
                } catch (NumberFormatException e) {
                    board.getCell(i, j).setValue(0);
                }
            }
    }
}
