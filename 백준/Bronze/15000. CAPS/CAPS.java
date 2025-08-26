import java.io.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        String upperCase = input.toUpperCase(Locale.ROOT);

        bw.write(upperCase);
        bw.flush();
        bw.close();
    }
}