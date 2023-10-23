package com.tasks.newer.palindrome;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class PalindromeCheckerTest {

    @Test
    public void testIsPalindromeWithPalindrome() {
        assertTrue(PalindromeChecker.isPalindrome("kajak"));
        assertTrue(PalindromeChecker.isPalindrome("racecar"));
        assertTrue(PalindromeChecker.isPalindrome("level"));
        assertTrue(PalindromeChecker.isPalindrome("deified"));
    }

    @Test
    public void testIsPalindromeWithNonPalindrome() {
        assertFalse(PalindromeChecker.isPalindrome("hello"));
        assertFalse(PalindromeChecker.isPalindrome("world"));
        assertFalse(PalindromeChecker.isPalindrome("programming"));
    }

    @Test
    public void testIsPalindromeWithEmptyString() {
        assertTrue(PalindromeChecker.isPalindrome(""));
    }

    @Test
    public void testIsPalindromeWithSingleCharacter() {
        assertTrue(PalindromeChecker.isPalindrome("a"));
    }

    @Test
    public void testIsPalindromeWithWhitespace() {
        assertTrue(PalindromeChecker.isPalindrome("amanaplanacanalpanama"));
    }

}