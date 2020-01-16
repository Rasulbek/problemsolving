import java.math.BigDecimal;
import java.util.*;

class Main {

    public static void main(String[] args) {
        //Input
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String[] s = new String[n + 2];
        for (int i = 0; i < n; i++) {
            s[i] = sc.next();
        }
        sc.close();

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n - 1; j++) {
                BigDecimal a1 = new BigDecimal(s[j]);
                BigDecimal a2 = new BigDecimal(s[j+1]);
                if (a2.compareTo(a1) == 1) {
                    s[n + 1] = s[j];
                    s[j] = s[j+1];
                    s[j+1] = s[n + 1];
                }
            }
        }

        //Write your code here

        //Output
        for (int i = 0; i < n; i++) {
            System.out.println(s[i]);
        }
    }

}