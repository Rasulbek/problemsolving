package HackerRank.Day30;

import java.util.*;


class Difference {
    private int[] elements;
    public int maximumDifference;

    public Difference(int[] a) {
        this.elements = a;
    }

    public void computeDifference() {
        maximumDifference = 0;
        for (int i = 0; i < elements.length - 1; i++) {
            for (int j = i + 1; j < elements.length; j++) {
                int tmpDiff = Math.abs(elements[i]-elements[j]);
                if (tmpDiff > maximumDifference) {
                    maximumDifference = tmpDiff;
                }
            }
        }
    }


    // Add your code here

} // End of Difference class

class Difference30 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        sc.close();

        Difference difference = new Difference(a);

        difference.computeDifference();

        System.out.print(difference.maximumDifference);
    }
}