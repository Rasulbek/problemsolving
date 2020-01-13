package HackerRank;
import java.util.Scanner;

public class Solution {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int q = sc.nextInt();
        while (q > 0) {
            long n = sc.nextInt();
            try {
                solveFor(n + 1);
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
            q--;
        }

    }

    private static void solveFor(long n) {
        int count = 0;
        for (int i = 2; i < Math.sqrt(n) + 1; i++) {
            int c = i * i;
            if (c > n) {
                break;
            }
            for (int a = 1; a < c; a++) {
                for (int b = 1; c < a + b; b++) {
                    if (checkTriangle(a, b, c)) {
                        if (checkPrimitiveRightness(a, b, c)) {
                            if (!checkSuperPerfect(a, b, c)) {
//                                System.out.println(String.format("a=%d, b=%d, c=%d", a, b, c));
                                count++;
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

        return ((((int) area) % 6 == 0) && (((int) area) % 28 == 0));
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


