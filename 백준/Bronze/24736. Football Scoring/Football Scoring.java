import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));



        for (int i = 0; i < 2; i++){
            StringTokenizer st = new StringTokenizer(br.readLine());
            int N = 0;
            N += Integer.parseInt(st.nextToken()) * 6;
            N += Integer.parseInt(st.nextToken()) * 3;
            N += Integer.parseInt(st.nextToken()) * 2;
            N += Integer.parseInt(st.nextToken());
            N += Integer.parseInt(st.nextToken()) * 2;
            bw.write(N + " ");
        }
        bw.flush();
    }
}
