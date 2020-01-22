package HackerRank.Day30;

import java.util.Scanner;

public class StringCast {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String S = in.next();

        try {
            Integer i = Integer.valueOf(S);
            System.out.println(i);
        } catch (Exception e) {
            System.out.println("Bad String");
        }
    }
}
