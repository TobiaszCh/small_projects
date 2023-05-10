package com.tasks.older;

public class Diamond {
    public static String print(int n) {
        StringBuilder resultHelp = new StringBuilder();
        int number = 1;
        String result;
        String diamond = "*";
        if(n % 2 == 1) {
            while (n >= number) {
                resultHelp.append(" ".repeat((n - number)/2)).append(diamond.repeat(number)).append("\n");
                number += 2;
            }
            number -= 2;
            while (1 < number) {
                number -= 2;
                resultHelp.append(" ".repeat((n - number)/2)).append(diamond.repeat(number)).append("\n");
            }
            result = String.valueOf(resultHelp);
        }
        else {
            result = null;
        }
        System.out.println(result);
        return result;
    }
}
