package com.thirtydaysofthejava.day12;

import java.io.*;
import java.util.*;
import java.util.stream.IntStream;

class Person {
    protected String firstName;
    protected String lastName;
    protected int idNumber;

    Person(String firstName, String lastName, int identification) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.idNumber = identification;
    }

    public void printPerson() {
        System.out.println("Name: " + lastName + ", " + firstName + "\nID: " + idNumber);
    }
}

class Student extends Person {
    private int[] testScores;

    public Student(String firstName, String lastName, int id, int[] scores) {
        super(firstName, lastName, id);
        this.testScores = scores;
    }

    public char calculate() {
        int nombre = testScores.length;
        int sum = IntStream.of(testScores).sum();
        int calcul = sum / nombre;


        if (calcul >= 90) {
            return 'O';
        } else if (calcul >= 80) {
            return 'E';
        } else if (calcul >= 70) {
            return 'A';
        } else if (calcul >= 55) {
            return 'P';
        } else if (calcul >= 40) {
            return 'D';
        } else {
            return 'T';
        }

    }
}

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String firstName = scan.next();
        String lastName = scan.next();
        int id = scan.nextInt();
        int numScores = scan.nextInt();
        int[] testScores = new int[numScores];
        for (int i = 0; i < numScores; i++) {
            testScores[i] = scan.nextInt();
        }
        scan.close();

        Student s = new Student(firstName, lastName, id, testScores);
        s.printPerson();
        System.out.println("Grade: " + s.calculate());
    }
}