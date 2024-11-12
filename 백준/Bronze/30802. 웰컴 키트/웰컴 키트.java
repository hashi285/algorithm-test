
import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int as = 0;
        int a = Integer.parseInt(br.readLine());
        int [] ts = new int[6];

        StringTokenizer st = new StringTokenizer(br.readLine());
        for (int i = 0; i < 6; i++) {

            ts[i] = Integer.parseInt(st.nextToken());
        }

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        int t = Integer.parseInt(st1.nextToken());
        int p = Integer.parseInt(st1.nextToken());

//        for (int i = 0; i < 6; i++) {
//            int i1 = ts[i] / t;
//            if (ts[i] == t) {as += i1;}
//            else as += i1 + 1;
//        }


        // cnt 계산 방식 수정
        for (int i = 0; i < 6; i++) {
            as += ts[i] / t;
            if (ts[i] % t > 0) {  // 나머지가 있을 때만 +1 추가
                as += 1;
            }
        }

        bw.write(as + "\n");
        bw.write(a / p + " " + a % p + "\n" );
        bw.flush();
        bw.close();
        br.close();
    }
}
