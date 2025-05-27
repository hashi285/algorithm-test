import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int[] N = {56,24,14,6};
        int k = 0;

        for (int i = 0; i < 4; i++){
            int n = Integer.parseInt(st.nextToken());
            k += n*N[i];
        }
        bw.write(k + "\n");
        bw.flush();
    }
}
