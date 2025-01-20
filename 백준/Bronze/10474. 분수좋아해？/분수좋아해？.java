import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            int a = Integer.parseInt(st.nextToken());
            int b = Integer.parseInt(st.nextToken());
            
            if (a == 0 && b == 0) break; // 종료 조건

            // 몫과 나머지 계산 및 출력
            int quotient = a / b;
            int remainder = a % b;
            bw.write(quotient + " " + remainder + " / " + b + "\n");
        }
        bw.flush();
        bw.close();
    }
}

