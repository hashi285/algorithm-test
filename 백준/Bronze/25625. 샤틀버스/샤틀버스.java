import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int x = Integer.parseInt(st.nextToken()); // 역에서 역으로 이동을 하는 시간
        int y = Integer.parseInt(st.nextToken()); // 제2공학관으로 y분 후 도착을 한다.

        if (x < y){
            bw.write(y - x + "\n");
        }else if (x > y){
            bw.write(x + y + "\n");
        }else if (x == y){bw.write("0" + "\n");}

        bw.flush();
         bw.close();
    }
}