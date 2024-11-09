import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] m = new int[n];
        for (int i = 0; i < n; i++) {
            m[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(m);
        bw.write(m[n-1] + "\n");
        bw.flush();
        bw.close();
    }
}
