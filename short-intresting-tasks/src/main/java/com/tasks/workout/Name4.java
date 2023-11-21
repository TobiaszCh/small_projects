package com.tasks.workout;

import java.util.ArrayList;
import java.util.List;

public class Name4 {
    List<String> aaa = new ArrayList<>();

    public Name4() {
        aaa.add("sda");
        aaa.add("sdeea");
        aaa.add("sdarrr");
    }

    public int filterIt(Filter filter) {
         return filter.filter(10, 12);
    }

    public int mStatic(int a, int b) {
        return a + b;
    }
}
