package com.tasks.newer.sign_counting;

public class SingCounting {
    public static int signChange(int[] arr) {
        int a = 0;
        for(int n = 0; n < arr.length - 1; n++) {
            if(arr[n] < 0 && arr[n + 1] >= 0) {
                a++;
            }
            if(arr[n] >= 0 && arr[n + 1] < 0) {
                a++;
            }
        }
        return a;
    }
}
