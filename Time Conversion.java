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

class Result {

    /*
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
        int h = Integer.parseInt(s.substring(0, 2));
        int m = Integer.parseInt(s.substring(3, 5));
        int sec = Integer.parseInt(s.substring(6, 8));
        String amPm = s.substring(8, 10);

        if (amPm.equals("PM") && h != 12) {
            h = (h + 12) % 24; // Convert to military time
        } else if (amPm.equals("AM") && h == 12) {
            h = 0; // Handle midnight
        }

        // Format the hour, minutes, and seconds to two digits
        String hour = String.format("%02d", h);
        String minutes = String.format("%02d", m);
        String seconds = String.format("%02d", sec);

        return hour + ":" + minutes + ":" + seconds;
    
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
