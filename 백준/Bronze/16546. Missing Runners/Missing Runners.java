import java.io.*;
import java.util.StringTokenizer;


public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A  = new int[N];

        for (int i = 0; i < N; i++) {
            A[i] = 0;
        }

        N -= 1;
        while (N --> 0) {
            int M = Integer.parseInt(st.nextToken());
            A[M-1] = M;
        }

        for (int i = 0; i < A.length; i++) {
            if (A[i] == 0) {
                System.out.println(i + 1);
            }
        }
    }
}
