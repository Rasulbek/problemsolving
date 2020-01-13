package CodeForces.Hello2020.A;

import java.util.Scanner;

public class A {
    private static String[] ns, ms;
    private static int n, m;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        m = sc.nextInt();
        ns = new String[n];
        for (int i = 0; i < n; i++) {
            ns[i] = sc.next();
        }
        ms = new String[m];
        for (int i = 0; i < m; i++) {
            ms[i] = sc.next();
        }
        int q = sc.nextInt();
        int cnt = 0;
        while (cnt < q) {
            printYearName(sc.nextInt());
            cnt++;
        }
    }

    private static void printYearName(int year) {
        int newN = (year - 1) % n;
        int newM = (year - 1) % m;
        System.out.println(ns[newN] + ms[newM]);
    }
}
