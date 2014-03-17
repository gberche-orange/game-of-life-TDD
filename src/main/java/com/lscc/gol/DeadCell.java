package com.lscc.gol;

public class DeadCell implements Cell {
    public static final Cell INSTANCE = new DeadCell();

    private DeadCell() {
    }

    public boolean isAlive() {
        return false;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        DeadCell cell = (DeadCell) obj;
        return isAlive() == cell.isAlive();
    }
}
