package HackerRank;

import java.util.Scanner;

public class BinaryNumbers {
    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        scanner.close();
        String usd = Integer.toBinaryString(n);
        usd += "f";
        System.out.println(usd);
        int max = 0;
        int tmp = 0;
        for (int i = 0; i < usd.length(); i++) {
            if (usd.substring(i,i+1).equals("1")) {
                tmp += 1;
            } else {
                if (tmp > max) {
                    max = tmp;
                }
                tmp = 0;
            }
        }
        System.out.println(max);
    }
}
