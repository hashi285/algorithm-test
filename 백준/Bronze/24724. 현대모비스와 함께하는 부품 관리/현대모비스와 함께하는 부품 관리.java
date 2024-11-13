import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a; i++) {
            bw.write("Material Management " + i + "\n");
            int b = Integer.parseInt(br.readLine());
            StringTokenizer st = new StringTokenizer(br.readLine());
            int c = Integer.parseInt(st.nextToken());
            int d = Integer.parseInt(st.nextToken());
            for (int j = 0; j < b; j++) {
                StringTokenizer st1 = new StringTokenizer(br.readLine());
                int s = Integer.parseInt(st1.nextToken());
                int t = Integer.parseInt(st1.nextToken());

            }
            bw.write("Classification ---- End!" + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
