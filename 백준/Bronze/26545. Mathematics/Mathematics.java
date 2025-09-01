import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        int B = 0;

        while (A-- > 0) {
            int C = Integer.parseInt(br.readLine());
            B += C;
        }
        bw.write(String.valueOf(B));
        bw.flush();
        bw.close();
    }
}
