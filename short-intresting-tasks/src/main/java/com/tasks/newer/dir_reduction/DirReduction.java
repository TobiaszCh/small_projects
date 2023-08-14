package com.tasks.newer.dir_reduction;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class DirReduction {

    public static String[] dirReduc(String[] arr) {
        boolean play = true;
        String[] result = new String[]{};
        List<String> a = new ArrayList<>(Arrays.asList(arr));
        System.out.println(a);
        while (play) {
            if (a.contains("North") && a.contains("South")) {
                a.remove("North");
                a.remove("South");
            } else if (a.contains("East") && a.contains("West")) {
                a.remove("East");
                a.remove("West");
            }
            else if (a.contains("NORTH") && a.contains("SOUTH")) {
                a.remove("NORTH");
                a.remove("SOUTH");
            } else if (a.contains("EAST") && a.contains("WEST")) {
                a.remove("EAST");
                a.remove("WEST");
            }
            else {
                play = false;
            }
        }
        return a.toArray(result);
    }
}
