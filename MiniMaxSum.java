import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class MiniMaxSum {

    /*
     * Complete the 'miniMaxSum' function below.
     *
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static void miniMaxSum(List<Integer> arr) {
    // Write your code here
        List<Integer> minArr = new ArrayList<>();
        List<Integer> maxArr = new ArrayList<>();
        
        long min = 0;
        long max = 0;
        
        arr.stream().sorted().limit(4).forEach(number -> minArr.add(number));
        arr.stream().sorted(Comparator.reverseOrder()).limit(4).forEach(number -> maxArr.add(number));
    
        for (long number : minArr) {
            min += number;
        }
        
        for (long number : maxArr) {
            max += number;
        }
        
        System.out.println(min + " " + max);
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        Result.miniMaxSum(arr);

        bufferedReader.close();
    }
}
