package com.tasks.older;

public class Palindrome {

    public static boolean isPalindrome(String word) {
        StringBuilder r1 = new StringBuilder(word);
        StringBuilder r2 = new StringBuilder(r1).reverse();
        return r1.toString().equals(r2.toString());
    }
}
