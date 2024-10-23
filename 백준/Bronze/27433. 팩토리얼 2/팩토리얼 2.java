import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());
        long b = 1L;
        for (long i = 1L; i <= a; i++) {b *= i;} bw.write(b + "\n");
        bw.flush();
        bw.close();
    }
}
