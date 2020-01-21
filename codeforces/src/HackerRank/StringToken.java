package HackerRank;

import java.util.Scanner;

public class StringToken {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();

        s =s.trim();
        if (s.isEmpty()) {
            System.out.println(0);
            return;
        }
        String[] tokens = s.split("[ !,?._'@]+");
        System.out.println(tokens.length);
        for (String t : tokens) {
            System.out.println(t);
        }

        scan.close();
    }
}
