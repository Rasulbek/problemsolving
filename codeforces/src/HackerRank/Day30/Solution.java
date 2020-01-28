package HackerRank.Day30;

import java.util.*;

public class Solution {

    static int[] a;

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        a = new int[n];
        for (int a_i = 0; a_i < n; a_i++) {
            a[a_i] = in.nextInt();
        }

        int numSwaps = 0;
        for (int i = 0; i < n; i++) {
            int numberOfSwaps = 0;
            for (int j = 0; j < n - 1; j++) {
                if (a[j] > a[j + 1]) {
                    swap(j, j + 1);
                    numberOfSwaps++;
                }
            }

            numSwaps += numberOfSwaps;
            if (numberOfSwaps == 0) {
                break;
            }
        }
        System.out.println("Array is sorted in " + numSwaps + " swaps.");
        System.out.println("First Element: " + a[0]);
        System.out.println("Last Element: " + a[n - 1]);
    }

    private static void swap(int i, int i1) {
        int tmp = a[i1];
        a[i1] = a[i];
        a[i] = tmp;
    }
}


