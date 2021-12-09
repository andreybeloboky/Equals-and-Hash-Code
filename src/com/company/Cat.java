package com.company;

import java.util.Objects;

public class Cat {

    private int age;
    private String name;

    /**
     * @param age  -age cat have written user;
     * @param name -name cat have written user;
     */
    public Cat(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * @return - age cat;
     */
    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return age == cat.age && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }
}
