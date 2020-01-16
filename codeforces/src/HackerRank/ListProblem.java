package HackerRank;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ListProblem {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        List<Integer> list = new ArrayList<>();
        int i = 0;
        while (i < n) {
            list.add(in.nextInt());
            i++;
        }
        int q = in.nextInt();
        i = 0;
        while (i < q) {
            in.nextLine();
            String query = in.nextLine();
            if (query.equals("Insert")) {
                list.add(in.nextInt(), in.nextInt());
            } else {
                list.remove(in.nextInt());
            }
            i++;
        }

        for (Integer integer : list) {
            System.out.print(integer + " ");
        }
    }


}