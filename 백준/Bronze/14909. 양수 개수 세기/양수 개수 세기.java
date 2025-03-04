import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = 0;

        while (st.hasMoreTokens()) {
            int a = Integer.parseInt(st.nextToken());
            if (a > 0) N++;
        }
        bw.write(N + "\n");
        bw.flush();
        bw.close();

    }
}
