package HackerRank.Day30;
import java.util.*;

class NodeL {
    int data;
    NodeL next;
    NodeL(int d) {
        data = d;
        next = null;
    }
}

class Linked30 {

    public static  NodeL insert(NodeL head,int data) {
        if (head == null) {
            return new NodeL(data);
        }
        NodeL next = head;
        boolean isNext = true;
        while (isNext) {
            if (next.next == null) {
                isNext = false;
            } else {
                next = next.next;
            }
        }
        next.next = new NodeL(data);
        return head;
    }

    public static void display(NodeL head) {
        NodeL start = head;
        while(start != null) {
            System.out.print(start.data + " ");
            start = start.next;
        }
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        NodeL head = null;
        int N = sc.nextInt();

        while(N-- > 0) {
            int ele = sc.nextInt();
            head = insert(head,ele);
        }
        display(head);
        sc.close();
    }
}