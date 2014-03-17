package com.lscc.gol;

public class LiveCell implements Cell {

    public static final Cell INSTANCE = new LiveCell();

    private LiveCell() {
    }

    public boolean isAlive() {
        return true;
    }

    public boolean equals(Object obj) {
        if (obj == null || getClass() != obj.getClass()) return false;
        LiveCell cell = (LiveCell) obj;
        return isAlive() == cell.isAlive();
    }
}
