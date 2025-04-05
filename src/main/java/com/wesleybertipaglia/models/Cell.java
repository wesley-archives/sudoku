package com.wesleybertipaglia.models;

public class Cell {
    private int value;
    private final boolean isEditable;

    public Cell(int value, boolean isEditable) {
        this.value = value;
        this.isEditable = isEditable;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        if (isEditable && value >= 1 && value <= 9) {
            this.value = value;
        }
    }

    public boolean isEditable() {
        return isEditable;
    }
}
