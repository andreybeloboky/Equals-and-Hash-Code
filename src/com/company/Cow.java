package com.company;

import java.util.Objects;

public class Cow {

    private int age;
    private String name;

    /**
     * @param age  - age cow have written user;
     * @param name - name cow have written user;
     */
    public Cow(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * @return - age cow;
     */
    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cow cow = (Cow) o;
        return age == cow.age && Objects.equals(name, cow.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
