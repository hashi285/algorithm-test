import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] A = new int[4];

        for (int i = 0; i < 4; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }
        Arrays.sort(A);
        bw.write(A[0] * A[2] + "\n");
        bw.flush();
        bw.close();
    }
}
