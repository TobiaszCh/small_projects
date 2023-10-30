package com.tasks.newer.leap_years;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class LeapYearsTest {

    @Test
    public void testYear2020()
    {
        assertTrue(LeapYears.isLeapYear(2020));
    }

    @Test
    public void testYear2000()
    {
        assertTrue(LeapYears.isLeapYear(2000));
    }

    @Test
    public void testYear2015()
    {
        assertFalse(LeapYears.isLeapYear(2015));
    }

    @Test
    public void testYear2100()
    {
        assertFalse(LeapYears.isLeapYear(2100));
    }

}