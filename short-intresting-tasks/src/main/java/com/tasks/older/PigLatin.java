package com.tasks.older;

public class PigLatin {
    public static String pigIt(String str) {
        String[] strs = str.split(" ");
        StringBuilder stringBuilder = new StringBuilder();
        for (String s : strs) {
            if (s.length() > 1) {
                stringBuilder.append(s.replace(s.charAt(0), ' ').trim())
                        .append(s.charAt(0)).append("ay").append(" ");
            } else {
                stringBuilder.append(s);
            }
        }
        stringBuilder.replace(stringBuilder.length()-1, stringBuilder.length(), "");
        return String.valueOf(stringBuilder);
    }
}
