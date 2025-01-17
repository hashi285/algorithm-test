
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = Integer.parseInt(st.nextToken());
        int B = Integer.parseInt(st.nextToken());

        if ((A + B) % 2 != 0 || (A - B) % 2 != 0 || A < B){
            bw.write("-1" + "\n");
        }else {
            bw.write((A + B) / 2 + " " + (A - B) / 2 + "\n");
        }
        bw.flush();
        bw.close();
    }
}
