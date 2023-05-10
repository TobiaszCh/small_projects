package com.tasks.newer.smile_faces;

import java.util.List;

public class SmileFaces {

    public static int countSmileys(List<String> arr) {
        int result = 0;
        List<String> sings = List.of(":)", ":D", ":-)", ":-D", ":~)", ":~D", ";)", ";D", ";-)", ";-D", ";~)", ";~D");
        for(String ar: arr) {
            for(String sing: sings) {
                if(ar.equals(sing)) {
                    result++;
                }
            }
        }
        return result;
    }
}
