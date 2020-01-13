package CodeForces.Hello2020.A.B;

import java.util.ArrayList;
import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        long cntVosxods = 0;
        int n = sc.nextInt();
        ArrayList<int[]> arrayList = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            int l = sc.nextInt();
            int[] s = new int[l];
            for (int j = 0; j < l; j++) {
                s[j] = sc.nextInt();
            }
            arrayList.add(s);
        }

        for (int i = 0; i < n; i++) {
            if (hasVosxod(arrayList.get(i))) {
                cntVosxods += n;
                continue;
            }
            for (int j = 0; j < n; j++) {
                if (hasVosxod(arrayList.get(j))) {
                    cntVosxods += 1;
                } else if (hasVosxod(arrayList.get(i), arrayList.get(j))) {
                    cntVosxods += 1;
                }
            }
        }

        System.out.println(cntVosxods);
    }

    private static boolean hasVosxod(int[] ints) {
        for (int i = 0; i < ints.length - 1; i++) {
            for (int j = i + 1; j < ints.length; j++) {
                if (ints[i] < ints[j]) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean hasVosxod(int[] ints, int[] ints1) {
        int min = ints[0];
        for (int i = 1; i < ints.length; i++) {
            if (ints[i] < min) {
                min = ints[i];
            }
        }
        int max = ints1[0];
        for (int i = 1; i < ints1.length; i++) {
            if (ints1[i] > max) {
                max = ints1[i];
            }
        }
        return min < max;
    }
}
