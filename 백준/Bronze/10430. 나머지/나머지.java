import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br= new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw= new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());
        int C = Integer.parseInt(st.nextToken());

        int N = (A + B)%C;
        int M = (A * B)%C;
        bw.write(N + "\n");
        bw.write(N + "\n");
        bw.write(M + "\n");
        bw.write(M + "\n");

        bw.flush();
        bw.close();
    }
}
