package com.thirtydaysofthejava.day15;

import java.io.*;
import java.util.*;

class Node {
    int data;
    Node next;

    Node(int d) {
        data = d;
        next = null;
    }
}

class Solution {

    public static Node insert(Node head, int data) {
        Node nouveau = new Node(data);

        // Cas 1 : le train est vide
        if (head == null) {
            return nouveau;
        }

        // Cas 2 : on part de la locomotive et on avance jusqu'au dernier wagon
        Node courant = head;
        while (courant.next != null) {
            courant = courant.next;
        }

        courant.next = nouveau;

        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while (start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while (N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head, ele);
        }
        display(head);
        sc.close();
    }
}