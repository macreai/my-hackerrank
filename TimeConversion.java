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

class TimeConversion {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
        char[] arrChar = s.toCharArray();
        
        if (arrChar[arrChar.length - 2] == 'A') {
            if (arrChar[0] == '1' && arrChar[1] == '2') {
                return "00" + new String(Arrays.copyOfRange(arrChar, 2, arrChar.length - 2));
            }
            return new String(Arrays.copyOfRange(arrChar, 0, arrChar.length - 2));
        } else if (arrChar[arrChar.length - 2] == 'P') {
            int hour = Integer.parseInt(new String(Arrays.copyOfRange(arrChar, 0, 2)));
            if (hour != 12) {
                hour += 12;
            }
            return String.format("%02d%s", hour, new String(Arrays.copyOfRange(arrChar, 2, arrChar.length - 2)));
        }

        return "";
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
