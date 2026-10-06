package com.thirtydaysofthejava.day1;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int i = scan.nextInt();
        double d = scan.nextDouble();
        scan.nextLine();
        String s = scan.nextLine();
        scan.close();
        System.out.println(i + 4);
        System.out.println(d + 4);
        System.out.println("HackerRank "+s);
    }
}