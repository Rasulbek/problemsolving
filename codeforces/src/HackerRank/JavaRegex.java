package HackerRank;

import java.util.Scanner;

public class JavaRegex {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        while(in.hasNext()){
            String IP = in.next();
            System.out.println(IP.matches(new MyRegex().pattern));
        }
    }


}
class MyRegex {
    public String pattern = "[a-zA-Z]{1}([a-zA-Z_0-9]){7,29}";
//    public String pattern = "((25[012345])|(2[01234]\\d)|([01]?\\d\\d)|(\\d))\\.((25[012345])|(2[01234]\\d)|([01]?\\d\\d)|(\\d))\\.((25[012345])|(2[01234]\\d)|([01]?\\d\\d)|(\\d))\\.((25[012345])|(2[01234]\\d)|([01]?\\d\\d)|(\\d))";
}