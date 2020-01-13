package HackerRank;
import java.io.*;
import java.util.*;

class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {

        for (int i = 0; i< grades.size(); i++) {
            if (grades.get(i) < 38) {
                continue;
            }
            int nextFiveMultiplier = (grades.get(i) / 5) + 1;
            if (nextFiveMultiplier * 5 - grades.get(i) < 3) {
                grades.set(i, nextFiveMultiplier * 5);
            }
        }

        return grades;

    }

}

public class Grades {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        int gradesCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> grades = new ArrayList<>();

        for (int i = 0; i < gradesCount; i++) {
            int gradesItem = Integer.parseInt(bufferedReader.readLine().trim());
            grades.add(gradesItem);
        }

        List<Integer> result = Result.gradingStudents(grades);

        for (int i = 0; i < result.size(); i++) {
            System.out.println(result.get(i));
        }

        bufferedReader.close();
    }
}
