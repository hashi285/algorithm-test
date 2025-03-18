import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());
        int bitmask = 0; // 비트마스크 사용

        while (M-- > 0) {
            StringTokenizer st = new StringTokenizer(br.readLine());
            String command = st.nextToken();
            int num = 0;
            if (st.hasMoreTokens()) num = Integer.parseInt(st.nextToken());

            switch (command) {
                case "add":
                    bitmask |= (1 << (num - 1));
                    break;
                case "remove":
                    bitmask &= ~(1 << (num - 1));
                    break;
                case "check":
                    bw.write(((bitmask & (1 << (num - 1))) != 0 ? "1\n" : "0\n"));
                    break;
                case "toggle":
                    bitmask ^= (1 << (num - 1));
                    break;
                case "all":
                    bitmask = (1 << 20) - 1;
                    break;
                case "empty":
                    bitmask = 0;
                    break;
            }
        }

        bw.flush();
    }
}
