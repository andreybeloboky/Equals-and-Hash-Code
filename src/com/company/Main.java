package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Cat cat = new Cat(11, "Kek");
        Cat cat1 = new Cat(121, "Kek");
        Dog dog = new Dog(11, "Kek");
        Cow cow = new Cow(11, "Kek");
        Farm farm = new Farm(new Cat[]{cat}, new Dog[]{dog}, new Cow[]{cow});
        System.out.println(cat.equals(dog));
        System.out.println(dog.toString());
        System.out.println(dog.getClass());
        System.out.println(cat.hashCode());
        System.out.println(dog.hashCode());
        System.out.println(cow.hashCode());
        System.out.println(farm.hashCode());

    }

    /**
     * @return - filling cell age array;
     */
    public static int addAge() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter age");
        return scanner.nextInt();
    }

    /**
     * @return - filling cell String array;
     */
    public static String addAName() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter name");
        return scanner.next();
    }
}
