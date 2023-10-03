package com.tasks.newer.sign_counting;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SingCountingTest {

    @Test
    public void basicTest() {
        assertEquals(0, SingCounting.signChange(new int[] {1, 3, 4, 5}));
        assertEquals(2, SingCounting.signChange(new int[] {1, -3, -4, 0, 5}));
        assertEquals(0, SingCounting.signChange(new int[] {}));
        assertEquals(3, SingCounting.signChange(new int[] {-47, 84, -30, -11, -5, 74, 77}));
    }

}