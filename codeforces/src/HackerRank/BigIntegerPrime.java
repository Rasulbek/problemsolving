package HackerRank;

import CodeForces.Hello2020.A.B.B;

import java.math.BigInteger;
import java.util.Scanner;

public class BigIntegerPrime {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String son = in.nextLine();

        BigInteger bigInteger = new BigInteger(son);
        if (bigInteger.isProbablePrime(1)) {
            System.out.println("prime");
        } else {
            System.out.println("not prime");
        }
    }


}