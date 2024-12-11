import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String a = br.readLine(); // 홍준의 아이디

        bw.write(":fan::fan::fan:" + "\n");
        bw.write(":fan::" + a + "::fan:" + "\n");
        bw.write(":fan::fan::fan:");
        bw.flush();
        bw.close();
        br.close();
    }
}
