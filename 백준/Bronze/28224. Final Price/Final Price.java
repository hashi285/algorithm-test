import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = 0;
            while (N-- > 0) {
                int A = Integer.parseInt(br.readLine());
                M += A;
            }
            bw.write(M + "\n");
            bw.flush();
    }
}
