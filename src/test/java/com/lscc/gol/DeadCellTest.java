package com.lscc.gol;

import org.junit.Test;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

public class DeadCellTest {
    @Test
    public void deadCellIsNotAlive() throws Exception {
        assertFalse(DeadCell.INSTANCE.isAlive());
    }

}
