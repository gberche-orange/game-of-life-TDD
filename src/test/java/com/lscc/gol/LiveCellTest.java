package com.lscc.gol;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class LiveCellTest {
    @Test
    public void liveCellIsAlive() throws Exception {
        assertTrue(LiveCell.INSTANCE.isAlive());
    }

}
