import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); // 카드의 개수
        int M = Integer.parseInt(st.nextToken()); // 카드의 합은 M과 가깝고, M을 넘지 말아야 한다.
        int C = 0; //정답

        int[] A = new int[N];

        StringTokenizer st1 = new StringTokenizer(br.readLine());

        for (int i = 0; i < N; i++){

            A[i] = Integer.parseInt(st1.nextToken());
        }

        for (int i = 0; i < N; i++){
            for (int a = i + 1; a < N; a++){
                for (int b = a + 1; b < N; b++){
                    int K = A[i] + A[a] + A[b];
                    if (K <= M && K > C) C = K;
                }
            }
        }
        bw.write(C + "\n");
        bw.flush();
        bw.close();
    }
}
