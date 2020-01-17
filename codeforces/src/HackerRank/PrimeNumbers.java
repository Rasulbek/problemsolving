package HackerRank;

import java.io.*;
import java.util.*;
import java.lang.reflect.*;

import static java.lang.System.in;

final class in extends InputStream{
    @Override
    public int read() throws IOException {
        return 0;
    }
}

class Prime {

    void checkPrime(int... args) {
        for (int s : args) {
            if (s > 1 && s < 4) {
                System.out.print(s + " ");
            } else {
                boolean b = false;
                for (int j = 2; j < Math.sqrt(s) + 1; j++) {
                    if (s % j == 0) {
                        b = false;
                        break;
                    }
                    b = true;
                }
                if (b) {
                    System.out.print(s + " ");
                }
            }
        }
        System.out.println();
    }
}

public class PrimeNumbers {

    public static void main(String[] args) {
        try {
            BufferedReader br = new BufferedReader(new InputStreamReader(in));
            int n1 = Integer.parseInt(br.readLine());
            int n2 = Integer.parseInt(br.readLine());
            int n3 = Integer.parseInt(br.readLine());
            int n4 = Integer.parseInt(br.readLine());
            int n5 = Integer.parseInt(br.readLine());
            Prime ob = new Prime();
            ob.checkPrime(n1);
            ob.checkPrime(n1, n2);
            ob.checkPrime(n1, n2, n3);
            ob.checkPrime(n1, n2, n3, n4, n5);
            Method[] methods = Prime.class.getDeclaredMethods();
            Set<String> set = new HashSet<>();
            boolean overload = false;
            for (int i = 0; i < methods.length; i++) {
                if (set.contains(methods[i].getName())) {
                    overload = true;
                    break;
                }
                set.add(methods[i].getName());

            }
            if (overload) {
                throw new Exception("Overloading not allowed");
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }

}

