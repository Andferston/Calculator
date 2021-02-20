import java.io.BufferedReader;
import java.io.InputStreamReader;

public class BuffNumbers {
    public static String buffer() throws Exception {
        BufferedReader read = new BufferedReader(new InputStreamReader(System.in));
        String task = read.readLine();
        return task;
    }
}
