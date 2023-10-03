package com.tasks.older;

public class ZywOo {
    public static int[] take(int[] arr, int n) {
        if(arr.length > 0 && n <= arr.length) {
            int a = 0;
            int[] res = new int[n];
            while (a < n) {
                res[a] = arr[a];
                a++;
            }
            return res;
        }
        else {
            return arr;
            }
    }
}

