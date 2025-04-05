package com.wesleybertipaglia.controllers;

import com.wesleybertipaglia.models.Board;
import com.wesleybertipaglia.views.BoardView;

import javax.swing.*;
import java.awt.*;

public class GameController extends JFrame {
    private final Board board;
    private final BoardView boardView;

    public GameController() {
        setTitle("Sudoku Game - OOP Edition");
        setSize(500, 550);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        board = new Board();
        boardView = new BoardView(board);

        JButton checkButton = new JButton("Check Solution");
        checkButton.addActionListener(e -> {
            boardView.updateBoardFromUI();
            if (board.isCompleteAndValid()) {
                JOptionPane.showMessageDialog(this, "✅ Correct solution!");
            } else {
                JOptionPane.showMessageDialog(this, "❌ Invalid solution!");
            }
        });

        add(boardView, BorderLayout.CENTER);
        add(checkButton, BorderLayout.SOUTH);

        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(GameController::new);
    }
}
