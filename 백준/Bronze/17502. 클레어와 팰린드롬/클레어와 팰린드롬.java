import java.io.*;
import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        StringBuilder sb = new StringBuilder(br.readLine());
        Set<String> set = new HashSet<>();

        for (int i = 0; i < N; i++) {
            String s = String.valueOf(sb.charAt(i));
            if (s.equals("?") && sb.charAt(N - 1 - i) == '?') bw.write("a");
            else if (s.equals("?")) bw.write(sb.charAt(N - 1 - i));
            else bw.write(s);
        }
        bw.flush();
    }
}
