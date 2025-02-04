
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int K = Integer.parseInt(st.nextToken());
        int M = 0;
        int[] A = new int[N];
        int C = 0; // 정답

        for (int i = 0; i < N; i++){
            A[i] = Integer.parseInt(br.readLine());
        }

        for (int i = N-1; i >= 0; i--){

            if (K == 0)break; // K 가 0일 경우 작업이 종료된다.

            if (K / A[i] > 0){ // K / A[i]이 0보다 크거나 같으면 K보다 A[i]가 크다는 의미
                C += K/A[i]; // C는 K원을 만드는데 필요한 동전의 최소개수이다. K/A[i]를 해서 나온 값을 C에 더한다.
                M = K/A[i];
                K -=  A[i] * M;

            }
        }


        bw.write(C + "\n");
        bw.flush();
        bw.close();
    }
}
