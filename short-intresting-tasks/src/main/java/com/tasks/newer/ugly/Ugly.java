package com.tasks.newer.ugly;

public class Ugly {
    public static String uglifyWord(String str) {
        String abc = "abcdefghijklmnopqrstuwvxyzABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] strs = str.split("");
        int a = 2;
        StringBuilder result = new StringBuilder();
        for (String s: strs) {
            if(abc.contains(s) && a % 2 ==0) {
                a++;
                result.append(s.toUpperCase());
            }
            else {
                a = 2;
                result.append(s.toLowerCase());
            }
        }
        return result.toString();
    }
}
