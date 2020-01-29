package HackerRank.Day30;

import java.io.*;
import java.util.*;

public class Queue30 {
    // Write your code here.
    LinkedList<Character> string = new LinkedList<>();
    Stack<Character> stack = new Stack<>();

    private void enqueueCharacter(char c) {
        string.add(c);
    }

    private void pushCharacter(char c) {
        stack.push(c);
    }


    private char popCharacter() {
        return stack.pop();
    }

    private char dequeueCharacter() {
        char c = string.get(0);
        string.remove(0);
        return c;
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String input = scan.nextLine();
        scan.close();

        // Convert input String to an array of characters:
        char[] s = input.toCharArray();

        // Create a Solution object:
        Queue30 p = new Queue30();

        // Enqueue/Push all chars to their respective data structures:
        for (char c : s) {
            p.pushCharacter(c);
            p.enqueueCharacter(c);
        }

        // Pop/Dequeue the chars at the head of both data structures and compare them:
        boolean isPalindrome = true;
        for (int i = 0; i < s.length/2; i++) {
            if (p.popCharacter() != p.dequeueCharacter()) {
                isPalindrome = false;
                break;
            }
        }

        //Finally, print whether string s is palindrome or not.
        System.out.println( "The word, " + input + ", is "
                + ( (!isPalindrome) ? "not a palindrome." : "a palindrome." ) );
    }

}