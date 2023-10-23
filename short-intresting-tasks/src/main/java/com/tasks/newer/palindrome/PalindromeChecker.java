package com.tasks.newer.palindrome;

public class PalindromeChecker {
    public static boolean isPalindrome(String str) {
        boolean result = false;
        String b = new StringBuilder(str).reverse().toString();
        if(str.equals(b)) {
            result = true;
        }
        return result;
    }
}
