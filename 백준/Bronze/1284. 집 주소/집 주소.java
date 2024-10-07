import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        while (true) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String a = st.nextToken();
            int b = Integer.parseInt(a); // 값 받아오기
            if (b == 0) break; // 0일 경우 종료

            int [] n = new int[a.length()];
                int 답 = 0;

                for (int i = 0; i < a.length(); i++) {
                    n[i] = a.charAt(i) - '0';
                    if (n[i] == 1) {
                        답 += 2;
                    } else if (n[i] == 0) {
                        답 += 4;
                    } else {
                        답 += 3;
                    }
                }

                답 += 2 + a.length()-1;
                System.out.println(답);
            }
    }
}
