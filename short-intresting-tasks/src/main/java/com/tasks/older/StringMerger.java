package com.tasks.older;

public class StringMerger {

    public static boolean isMerge(String s, String part1, String part2) {
        boolean result = true;
        StringBuilder p1 = new StringBuilder(part1);
        StringBuilder p2 = new StringBuilder(part2);
        for (int i = 0; i < s.length(); i++) {
                if (s.charAt(i) != p1.charAt(0) && s.charAt(i) != p2.charAt(0)) {
                    result = false;
                    break;
                }
                if(s.charAt(i) == p1.charAt(0)) {
                    p1.replace(0, 1, "");
                }
                if(s.charAt(i) == p2.charAt(0)) {
                    p2.replace(0, 1, "");
                }
                //System.out.println(p1);
                //System.out.println(p2);
            }
        System.out.println(result);
        return result;
    }
}
