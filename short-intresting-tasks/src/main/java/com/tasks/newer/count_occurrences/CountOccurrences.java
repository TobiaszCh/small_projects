package com.tasks.newer.count_occurrences;

import java.io.File;

public class CountOccurrences {
    public static int countOccurrences(String text, String phrase) {
        int result = 0;
        String textLower = text.toLowerCase();
        String phraseLower = phrase.toLowerCase();
        String[] textsLower = textLower.split(" ");
        for(String tex: textsLower) {
            if(tex.equals(phraseLower)) {
                result++;
            }
        }
        return result;
    }
}
