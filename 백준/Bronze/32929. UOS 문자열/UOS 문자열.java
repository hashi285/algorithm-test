import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        String[] a = new String[3];
        int b = Integer.parseInt(br.readLine());
        int c = b % 3;

        if (c == 0) {
            bw.write("S");
        } else if (c == 1) {
            bw.write("U");
        } else if (c == 2) {
            bw.write("O");
        }
        bw.flush();
    }
}
