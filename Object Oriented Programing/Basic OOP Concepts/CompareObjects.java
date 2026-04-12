// Topic: Multiple Objects Comparison
// Difficulty: Easy
// Topic: OOP Basics

import java.util.*;

class StudentCompare {
    String name;
    int marks;
}

public class CompareObjects {
    public static void main(String[] args) {
        StudentCompare s1 = new StudentCompare();
        s1.name = "Aman";
        s1.marks = 85;

        StudentCompare s2 = new StudentCompare();
        s2.name = "Riya";
        s2.marks = 92;

        if (s1.marks > s2.marks) {
            System.out.println(s1.name + " has higher marks");
        } else {
            System.out.println(s2.name + " has higher marks");
        }
    }
}