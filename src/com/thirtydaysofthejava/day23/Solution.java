package com.thirtydaysofthejava.day23;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

class Node {
    Node left, right;
    int data;

    Node(int data) {
        this.data = data;
        left = right = null;
    }
}

public class Solution {

    static void levelOrder(Node root) {
        Queue<Node> file = new LinkedList<>();
        file.add(root);
        while (!file.isEmpty()) {
            Node courant = file.remove();
            System.out.print(courant.data + " ");

            if (courant.left != null) {
                file.add(courant.left);
            }
            if (courant.right != null) {
                file.add(courant.right);
            }
        }
    }

    public static Node insert(Node root, int data) {
        if (root == null) {
            return new Node(data);
        } else {
            Node cur;
            if (data <= root.data) {
                cur = insert(root.left, data);
                root.left = cur;
            } else {
                cur = insert(root.right, data);
                root.right = cur;
            }
            return root;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        Node root = null;
        while (T-- > 0) {
            int data = sc.nextInt();
            root = insert(root, data);
        }
        levelOrder(root);
    }
}
