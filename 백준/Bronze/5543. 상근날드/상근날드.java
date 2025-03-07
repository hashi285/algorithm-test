import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = 2;

        int C = Integer.parseInt(br.readLine());

        while (n-->0){
            int K = Integer.parseInt(br.readLine());
            if (K < C){
                C = K;
            }
        }

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        if (N < M){
            bw.write(C + N - 50 + "\n");
        }else bw.write(C + M - 50 + "\n");

        bw.flush();
        bw.close();
    }
}
