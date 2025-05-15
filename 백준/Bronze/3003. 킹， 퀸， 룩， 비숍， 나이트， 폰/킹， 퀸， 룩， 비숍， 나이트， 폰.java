import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] N = new int[6];
        int[] M = new int[] {1, 1, 2, 2, 2, 8};

        for (int i = 0; i < 6; i++) {
            N[i] = Integer.parseInt(st.nextToken());
            bw.write(M[i] - N[i] + " ");
        }
        bw.flush();
        bw.close();
    }
}
