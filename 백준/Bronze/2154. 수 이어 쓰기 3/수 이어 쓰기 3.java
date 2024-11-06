import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringBuilder a = new StringBuilder();

        int s = Integer.parseInt(br.readLine());
        for (int i = 1; i <= s; i++) {
            a.append(i);
        }
        bw.write(a.toString().indexOf(String.valueOf(s)) + 1 + "\n");
        bw.flush();
        bw.close();
    }
}