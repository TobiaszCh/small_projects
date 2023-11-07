package com.tasks.newer.valid_parentheses;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class ParenthesesTest {

    @Test
    @DisplayName("Should return true for valid parentheses")
    void validCases() {
        runTest(true, "()");
        runTest(true, "((()))");
        runTest(true, "()()()");
        runTest(true, "(()())()");
        runTest(true, "()(())((()))(())()");
    }

    @Test @DisplayName("Should return false for invalid parentheses")
    void invalidCases() {
        runTest(false, ")(");
        runTest(false, "()()(");
        runTest(false, "((())");
        runTest(false, "())(()");
        runTest(false, ")()");
        runTest(false, ")");
    }

    @Test @DisplayName("Should return true for empty strings")
    void emptyString() {
        runTest(true, "");
    }
    private void runTest(boolean expected, String input) {
        assertEquals(expected, Parentheses.validParentheses(input), "Test failed for input \""+input+"\"");
    }

}