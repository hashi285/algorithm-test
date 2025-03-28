import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        /**
         * 만약 n이
         * 1인 경우 : 1
         * 2인 경우 : 3
         * 3인 경우 : 5
         * 4인 경우 : 11
         * 5인 경우 : 21
         */


        int n = Integer.parseInt(br.readLine());

        int[] arr = new int[1001];

        arr[1] = 1;
        arr[2] = 3;

        for (int i = 3; i <= n; i++){
            arr[i] = (arr[i-1] + 2 * arr[i-2])%10007;
        }

        bw.write(arr[n] + "\n");
        bw.flush();
        bw.close();

    }
}
