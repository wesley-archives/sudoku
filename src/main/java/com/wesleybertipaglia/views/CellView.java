package com.wesleybertipaglia.views;

import javax.swing.*;
import java.awt.*;

public class CellView extends JTextField {
    private final int row;
    private final int col;

    public CellView(int row, int col) {
        this.row = row;
        this.col = col;
        setHorizontalAlignment(JTextField.CENTER);
        setFont(new Font("Arial", Font.BOLD, 20));
    }

    public int getRow() { return row; }
    public int getCol() { return col; }
}
