package com.tasks.older;

public class ROT13 {

    public static String rot13(String message) {
        String abc = "abcdefghijklm";
        String nop = "nopqrstuvwxyz";
        String ABC = abc.toUpperCase();
        String NOP = nop.toUpperCase();
        String[] messages = message.split("");
        StringBuilder result = new StringBuilder();
        for(String mess: messages) {
            String MESS = mess.toUpperCase();
            if(abc.contains(mess)) {
                result.append(mess.replace(mess, String.valueOf(nop.charAt(abc.indexOf(mess)))));
            } else if (ABC.contains(MESS)) {
                result.append(MESS.replace(MESS, String.valueOf(NOP.charAt(ABC.indexOf(MESS)))));
            } else if (nop.contains(mess)) {
                result.append(mess.replace(mess, String.valueOf(abc.charAt(nop.indexOf(mess)))));
            } else if (NOP.contains(MESS)) {
                result.append(MESS.replace(MESS, String.valueOf(ABC.charAt(NOP.indexOf(MESS)))));
            }
            else {
                result.append(mess);
            }
        }
        return String.valueOf(result);
    }
}
