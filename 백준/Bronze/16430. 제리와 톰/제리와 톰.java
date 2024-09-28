import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int 분자 = Integer.parseInt(st.nextToken());
            int 분모 = Integer.parseInt(st.nextToken());

            int 정답_분자 = 분모 - 분자;
            int 정답_분모 = 분모;

            bw.write(정답_분자 + " " + 정답_분모 + "\n");
            bw.flush();
            bw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
