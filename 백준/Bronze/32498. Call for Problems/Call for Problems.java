import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());

        int N = 0;
        while (A-- > 0) {
            int B = Integer.parseInt(br.readLine());
            if (B % 2 != 0){
                N++;
            }
        }
        bw.write(N + "\n");
        bw.flush();
        bw.close();
    }
}
