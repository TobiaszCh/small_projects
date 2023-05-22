package com.tasks.newer.scrambiles;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Scramblies {

    public static boolean scramble(String str1, String str2) {
        List<String> str1s = new ArrayList<>(Arrays.asList(str1.split("")));
        String[] str2s = str2.split("");
        boolean result = true;
        for(String st2: str2s) {
            if(str1s.contains(st2)) {
                str1s.remove(st2);
            }
            else {
                result = false;
                break;
            }
        }
        return result;
    }
}
