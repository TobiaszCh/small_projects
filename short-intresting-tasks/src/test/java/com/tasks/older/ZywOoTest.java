package com.tasks.older;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ZywOoTest {

    @Test
    public void basicTests() {
        assertArrayEquals(new int[]{0, 1, 2}, ZywOo.take(new int[]{0, 1, 2, 3, 5, 8, 13}, 3));
    }

}