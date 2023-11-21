package com.tasks.newer.vovels;

public class Vowels {

    public static int getCount(String str) {
        int a = str.replace("a", "").replace("e","" )
                .replace("i", "").replace("o", "").replace("u", "").length();
        int b = str.length();

        return b - a;
    }
}
