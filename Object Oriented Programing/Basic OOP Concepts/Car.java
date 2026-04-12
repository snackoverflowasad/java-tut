// Topic: Class with Attributes
// Difficulty: Easy
// Topic: OOP Basics

import java.util.*;


class CarDetails {
    String brand;
    int speed;

    void display() {
        System.out.println("Brand: " + brand);
        System.out.println("Speed: " + speed);
    }
}

public class Car {
    public static void main(String[] args) {
        CarDetails c1 = new CarDetails();
        c1.brand = "BMW";
        c1.speed = 180;

        c1.display();
    }
}