import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String s = st.nextToken(); // 회원 이름
            int a = Integer.parseInt(st.nextToken()); // 나이
            int b = Integer.parseInt(st.nextToken()); // 몸무게

            if ((s + " " + a + " " + b).equals("# 0 0")) {break;} // 만약 "# 0 0" 이 입력이 되면 반복문 중지

            else if (a > 17 || b >= 80) {bw.write(s + " " + "Senior" + "\n");} // 성인인 경우

            else {bw.write(s + " " + "Junior" + "\n");} // 청소년인 경우
        }
        
        bw.flush();
        bw.close();
    }
}
