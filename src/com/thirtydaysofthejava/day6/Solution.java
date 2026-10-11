package com.thirtydaysofthejava.day6;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for (int i = 0; i < T; i++) {
            String s = sc.next();
            StringBuilder pair = new StringBuilder();
            StringBuilder impair = new StringBuilder();
            for (int j = 0; j < s.length(); j++) {
                if (j % 2 == 0) {
                    pair.append(s.charAt(j));
                } else {
                    impair.append(s.charAt(j));
                }
            }
            System.out.println(pair.toString() + " " + impair.toString());
        }
        sc.close();
    }
}