package com.lscc.gol;

import org.junit.Test;

import static junit.framework.Assert.assertEquals;

public class GridTest {
    @Test
    public void initializeGridWithSize() throws Exception {
        Grid grid = aGrid(10);
        assertEquals(grid.size(), 10);
    }

    @Test
    public void populateGridWithLiveAndDeadCells() throws Exception {
        Grid grid = aGrid(10);
        grid.put(LiveCell.INSTANCE, 0, 0);
        grid.put(LiveCell.INSTANCE, 0, 1);
        grid.put(LiveCell.INSTANCE, 0, 2);
        grid.put(DeadCell.INSTANCE, 0, 3);
        assertEquals(grid.liveCellsSize(), 3);

        System.out.println(grid);
    }

    private Grid aGrid(int size) {
        return new Grid(size);
    }
}
