package com.company;

import java.util.Objects;

public class Dog {

    private int age;
    private String name;

    /**
     * @param age  -age dog have written user;
     * @param name -name dog have written user;
     */
    public Dog(int age, String name) {
        this.age = age;
        this.name = name;
    }

    /**
     * @return - age dog;
     */
    public int getAge() {
        return age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Dog dog = (Dog) o;
        return age == dog.age && Objects.equals(name, dog.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(age, name);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
