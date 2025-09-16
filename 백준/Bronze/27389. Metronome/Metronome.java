import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        double N = Double.parseDouble(br.readLine());
        N = N/4;
        bw.write(String.valueOf(Math.round(N * 100.0) / 100.0));
        bw.flush();
        bw.close();
    }
}
