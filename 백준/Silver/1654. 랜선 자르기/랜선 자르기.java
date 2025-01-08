import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        int K = Integer.parseInt(st.nextToken()); // 랜선 개수
        int N = Integer.parseInt(st.nextToken()); // 필요한 랜선 개수

        int[] B = new int[K];
        long max = 0;

        // 랜선 길이 입력 및 최댓값 찾기
        for (int i = 0; i < K; i++) {
            B[i] = Integer.parseInt(br.readLine());
            max = Math.max(max, B[i]);
        }

        long min = 1; // 최소 길이
        long result = 0;

        // 이진 탐색
        while (min <= max) {
            long mid = (min + max) / 2; // 중간 길이
            long count = 0;

            // 중간 길이로 자를 수 있는 랜선의 개수 계산
            for (int i = 0; i < K; i++) {
                count += B[i] / mid;
            }

            // 자른 랜선 개수가 충분하면
            if (count >= N) {
                result = mid; // 길이 저장
                min = mid + 1; // 더 긴 길이를 시도
            } else {
                max = mid - 1; // 더 짧은 길이를 시도
            }
        }

        System.out.println(result);
    }
}
