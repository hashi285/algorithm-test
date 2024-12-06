import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long first = Long.parseLong(st.nextToken());
        long second = Long.parseLong(st.nextToken());
        long answer = Long.parseLong(st.nextToken());

        if (first + second == answer) bw.write("correct!");
        else bw.write("wrong!");

        bw.flush();
        bw.close();
        br.close();
    }
}
