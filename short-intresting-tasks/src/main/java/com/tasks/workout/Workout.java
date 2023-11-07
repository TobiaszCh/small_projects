package com.tasks.workout;

import java.util.Objects;

public class Workout {

    private String name;
    int age;

    public Workout(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }
    @Override
    public String toString() {
        return "Workout{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
