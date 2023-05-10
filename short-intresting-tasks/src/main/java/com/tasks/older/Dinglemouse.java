package com.tasks.older;

import java.util.ArrayList;
import java.util.List;

public class Dinglemouse {

    public static String fireAndFury(final String tweet) {

        List<String> fires = new ArrayList<>();
        fires.add("");
        fires.add(" You are fired!");
        fires.add(" You and you are fired!");
        fires.add(" You and you and you are fired!");


        List<String> furies = new ArrayList<>();
        furies.add("");
        furies.add(" I am furious.");
        furies.add(" I am really furious.");
        furies.add(" I am really really furious.");

        String tweetF = tweet.replace("FIRE", "1").replace("FURY", "2");
        int fire = 0;
        int furry = 0;
        StringBuilder stringBuilder = new StringBuilder();

        for(int i = 0; i < tweetF.length(); i++) {
            if (tweetF.charAt(i) == '1') {
                fire++;
                stringBuilder.append(furies.get(furry));
                furry = 0;
            } else if (tweetF.charAt(i) == '2') {
                furry++;
                stringBuilder.append(fires.get(fire));
                fire = 0;
            }

        }
        if (fire != 0) {
            stringBuilder.append(fires.get(fire));
        } else if (furry != 0) {
            stringBuilder.append(furies.get(furry));
        }
        else if (!(tweetF.contains("1") && tweetF.contains("2"))) {
            stringBuilder.append(" Fake tweet.");
        }
        return String.valueOf(stringBuilder.replace(0,1,""));
    }
}
