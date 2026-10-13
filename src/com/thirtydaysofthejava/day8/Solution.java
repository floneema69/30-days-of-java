package com.thirtydaysofthejava.day8;

import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Map<String, Integer> annuaire = new HashMap<>();

        for (int i = 0; i < T; i++) {
            String name = sc.next();
            int number = sc.nextInt();
            annuaire.put(name, number);
        }

        while (sc.hasNext()) {
            String name = sc.next();
            if (annuaire.containsKey(name)) {
                int valeur = annuaire.get(name);
                System.out.println(name + "=" + valeur);
            } else {
                System.out.println("Not found");
            }
        }


    }
}