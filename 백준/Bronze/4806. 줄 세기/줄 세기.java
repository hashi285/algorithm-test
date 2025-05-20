import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int lineCount = 0;
        String line;

        while ((line = br.readLine()) != null) {
            lineCount++;
        }

        System.out.println(lineCount);
    }
}