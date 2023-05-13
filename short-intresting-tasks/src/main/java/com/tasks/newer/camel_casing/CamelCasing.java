package com.tasks.newer.camel_casing;

public class CamelCasing {

    public static String camelCase(String input) {
        String abc = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String[] splits = input.split("");
        StringBuilder stringBuilder = new StringBuilder();
        for(String s: splits) {
            if(abc.contains(s) && splits.length > 1) {
                stringBuilder.append(" ").append(s);
            }
            else {
                stringBuilder.append(s);
            }
        }
        return stringBuilder.toString();
    }
}
