import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); //경기의 수 N
        int M = Integer.parseInt(st.nextToken()); //위원의 수 M

        int[] C = new int[N];

        int[] A = new int[N];
        int B = 0;

        for (int i = 0; i < N; i++){
            A[i] = Integer.parseInt(br.readLine());
            C[i] = 0;
        }

        for (int i = 1; i <= M; i++){
            B = Integer.parseInt(br.readLine());
            for (int o = 0; o < N; o++){
                if (A[o] <= B){
                    C[o] += 1;
                    break;
                }
            }
        }

        // 가장 많은 득표를 받은 경기 찾기
        int maxVotes = 0;
        int resultIndex = 0;
        for (int i = 0; i < N; i++) {
            if (C[i] > maxVotes) {
                maxVotes = C[i];
                resultIndex = i;
            }
        }

        bw.write((resultIndex + 1) + "\n"); // 경기 번호는 1부터 시작
        bw.flush();
        bw.close();
        br.close();
    }
}
