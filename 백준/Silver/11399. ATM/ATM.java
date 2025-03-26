import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = 0; // 정답 0으로 초기화
        int B = 0;


        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[N+1];
        arr[0] = 0; // 쓰지 않는 arr[0]을 0으로 초기화

        for (int i = 1; i <= N; i++) { // arr 값 초기화
            arr[i] = Integer.parseInt(st.nextToken());
        }

        Arrays.sort(arr); // arr 정렬
        for (int i = 1; i <= N; i++) {

            A = A + arr[i];
            B += A;
        }
        bw.write(B + "\n");
        bw.flush();
        bw.close();
    }
}
