import java.io.*;

public class Main {

    static int[] C = new int[41];
    static int[] D = new int[41];

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine());


        while (n-- > 0) {
            int a = Integer.parseInt(br.readLine());
            fibonacci(a);
            bw.write(C[a] + " " + D[a] + "\n");
        }
        bw.flush();
        bw.close();
    }

    public static void fibonacci(int n) {

        C[0] = 1;
        C[1] = 0;
        C[2] = 1;
        C[3] = 1;

        D[0] = 0;
        D[1] = 1;
        D[2] = 1;
        D[3] = 2;
        for (int i = 4; i <= n; i++) {
            C[i] = C[i - 1] + C[i - 2];
            D[i] = D[i - 1] + D[i - 2];
        }
    }
}
