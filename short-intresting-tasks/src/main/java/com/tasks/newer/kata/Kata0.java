package com.tasks.newer.kata;

public class Kata0 {
    public static String pattern(int n){
        StringBuilder add = new StringBuilder("1");
        String n1 = String.valueOf(n);
        int loop = n -1;
        if(n > 1) {
            while (loop > 0) {
                loop--;
                add.append("\n");
                add.append("*");
                add.append(n1);
            }

            System.out.println(add);
        }
        return add.toString();
    }
}
