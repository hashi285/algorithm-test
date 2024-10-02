import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());


            int a = Integer.parseInt(st.nextToken());

            for (int i = 1; i <= a; i++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int b = Integer.parseInt(st1.nextToken());
                int c = Integer.parseInt(st1.nextToken());
                int d = b + c;
                bw.write("Case #" + i + ": " + d + "\n");
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
