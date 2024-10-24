import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] b = new int[a];

        for (int i = 0; i < a; i++) {
            b[i] = Integer.parseInt(st.nextToken());
        }
        int c = Integer.parseInt(br.readLine());
        int d = 0;
        for (int i = 0; i < a; i++) {
            if (b[i] == c) {
             d++;
            }
        }
        bw.write(d + "\n");
        bw.flush();
        bw.close();
    }
}
