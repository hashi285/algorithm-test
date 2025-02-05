import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        int[] dp = new int[N + 1]; // DP 배열 선언

        dp[1] = 0; // 1은 연산 없이 그대로 1이므로 0번

        for (int i = 2; i <= N; i++) {
            // 기본적으로 1을 빼는 경우
            dp[i] = dp[i - 1] + 1;

            // 2로 나누어 떨어질 때
            if (i % 2 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 2] + 1);
            }

            // 3으로 나누어 떨어질 때
            if (i % 3 == 0) {
                dp[i] = Math.min(dp[i], dp[i / 3] + 1);
            }
        }

        System.out.println(dp[N]); // 최소 연산 횟수 출력
    }
}
