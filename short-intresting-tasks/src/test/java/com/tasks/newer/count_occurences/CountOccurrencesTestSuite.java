package com.tasks.newer.count_occurences;

import com.tasks.newer.count_occurrences.CountOccurrences;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CountOccurrencesTestSuite {

    @Test
    public void testCountOccurrences() {
        String text = "Ala ma kota, a kot ma Ale";
        String phrase = "ma";
        int expected = 2;
        int result = CountOccurrences.countOccurrences(text, phrase);
        assertEquals(expected, result);

        text = "Ala ma kota, a kot ma Ale";
        phrase = "Ala";
        expected = 1;
        result = CountOccurrences.countOccurrences(text, phrase);
        assertEquals(expected, result);

        text = "Ala ma kota, a kot ma Ale";
        phrase = "pies";
        expected = 0;
        result = CountOccurrences.countOccurrences(text, phrase);
        assertEquals(expected, result);
    }

}