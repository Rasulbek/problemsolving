package HackerRank;
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

class Linked30 {

    public static  Node insert(Node head,int data) {
        if (head == null) {
            return new Node(data);
        }
        Node next = head;
        boolean isNext = true;
        while (isNext) {
            if (next.next == null) {
                isNext = false;
            } else {
                next = next.next;
            }
        }
        next.next = new Node(data);
        return head;
    }

    public static void display(Node head) {
        Node start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        Node head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}