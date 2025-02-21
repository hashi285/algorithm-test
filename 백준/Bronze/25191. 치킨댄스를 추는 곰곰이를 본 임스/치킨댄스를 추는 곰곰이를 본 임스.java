import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        int 콜라 = Integer.parseInt(st.nextToken());
        int 맥주 = Integer.parseInt(st.nextToken());

        int b = 콜라 / 2 + 맥주;
        if (a < b){
            bw.write(a + "\n");
        }else {
            bw.write(b + "\n");
        }
        bw.flush();
        bw.close();

    }
}
