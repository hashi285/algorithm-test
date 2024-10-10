import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 시간
        int M = Integer.parseInt(st.nextToken()); // 분
        int K = Integer.parseInt(st.nextToken()); // 초
        int A = Integer.parseInt(st1.nextToken()); // 조리 시간

        K += A;
        if (K >= 60) {
            M += K / 60;
            K %= 60;
        }
        if (M >= 60) {
            N += M / 60;
            M %= 60;
        }
        if (N >= 24) {
            N %= 24;

        }
        bw.write(N + " " + M + " " + K + "\n");
        bw.flush();
        bw.close();
    }
}
