// Topic: Class vs Object
// Difficulty: Easy
// Topic: OOP Basics

import java.util.*;

class Animal {
    String name;

    void speak() {
        System.out.println(name + " makes a sound");
    }
}

public class ClassVsObject {
    public static void main(String[] args) {
        Animal a1 = new Animal(); // object
        a1.name = "Dog";

        a1.speak();
    }
}