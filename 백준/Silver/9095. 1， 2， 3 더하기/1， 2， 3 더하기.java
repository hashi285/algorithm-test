import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine()); // 테스트 케이스의 개수 T

        int[] A = new int[11];
        A[1] = 1;
        A[2] = 2;
        A[3] = 4;
        A[4] = 7;

        for(int i = 0; i < T; i++){
            int N = Integer.parseInt(br.readLine());

            for (int j = 5; j <= N; j++){
                A[j] = A[j - 1] + A[j - 2] + A[j - 3];
            }
            bw.write(A[N] + "\n");
        }
        bw.flush();
    }
}