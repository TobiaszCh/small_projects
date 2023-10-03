package com.tasks.newer.search_word;

import java.util.ArrayList;
import java.util.List;

public class WordSearch {
    public static String[] findWord(String x, String[] y){
        List<String> help = new ArrayList<>();
            for (String yy : y) {
                if (yy.toLowerCase().contains(x.toLowerCase())) {
                    help.add(yy);
                }
            }
        if (help.isEmpty()){
            help.add("Empty");
        }
        String[] result = new String[help.size()];
        return help.toArray(result);
    }
}
