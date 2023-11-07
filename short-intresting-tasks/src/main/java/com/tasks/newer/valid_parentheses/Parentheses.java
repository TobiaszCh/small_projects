package com.tasks.newer.valid_parentheses;

public class Parentheses {

    public static boolean validParentheses(String parenStr) {
        int a = 0;
        String[] parentheses = parenStr.split("");
        for(String parenthese: parentheses) {
            if(parenthese.equals("(")){
                a++;
            }
            else if (a > 0){
                a--;
            }
            else {
                a--;
                break;
            }
        }
        return parenStr.isEmpty() || a == 0;
    }
}
