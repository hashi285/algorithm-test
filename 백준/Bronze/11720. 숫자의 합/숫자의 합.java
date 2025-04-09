import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String M = br.readLine();
        int b = 0;

        for (int i = 0; i < N; i++) {
            String a = "";
            a = String.valueOf(M.charAt(i)) ;
            b = b + Integer.parseInt(a);
        }

        bw.write(b + "\n");
        bw.flush();
        bw.close();
    }
}
