package HackerRank;

import java.util.*;

public class Euler218 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q > 0) {
            long n = sc.nextInt();
            solveFor(n + 1);
            q--;
        }

    }

    private static void solveFor(long n) {
        int count = 0;
        for (int a = 1; a < n; a++) {
            for (int b = 1; b < n; b++) {
                for (int c = 1; c < a + b; c++) {
                    if (checkTriangle(a, b, c)) {
                        if (checkPrimitiveRightness(a, b, c)) {
                            int hypotenuse = Math.max(Math.max(a, b), c);
                            if (checkPerfectHypotenuse(hypotenuse)) {
                                if (!checkSuperPerfect(a, b, c)) {
                                    System.out.println(String.format("a=%d, b=%d, c=%d", a, b, c));
                                    count++;
                                }
                            }
                        }
                    } else {
                        continue;
                    }
                }
            }
        }
        System.out.println(count);
    }

    private static boolean checkSuperPerfect(int a, int b, int c) {
        int sum = a + b + c;
        int max = Math.max(Math.max(a, b), c);
        int min = Math.min(Math.min(a, b), c);
        int min2 = sum - min - max;
        double area = (min * min2) / 2.d;

        return ((((int)area) % 6 == 0) && (((int)area) % 28 == 0));
    }

    private static boolean checkPerfectHypotenuse(int c) {
        double sqrt = Math.sqrt(c);
        int digit = (int) sqrt;
        return sqrt == digit;
    }

    private static boolean checkTriangle(int a, int b, int c) {
        boolean canBe = a + b > c && a + c > b && b + c > a;
        if (!canBe) {
            return false;
        }

        return ((a * a + b * b == c * c) || (a * a + c * c == b * b) || (c * c + b * b == a * a));
    }


    private static boolean checkPrimitiveRightness(int a, int b, int c) {
        return gcdAlgorithm(a, b) == 1 && gcdAlgorithm(b, c) == 1;
    }

    private static int gcdAlgorithm(int n1, int n2) {
        if (n2 == 0) {
            return n1;
        }
        return gcdAlgorithm(n2, n1 % n2);
    }
}

