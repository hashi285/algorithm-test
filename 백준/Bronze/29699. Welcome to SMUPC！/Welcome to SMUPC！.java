import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = "WelcomeToSMUPC";
        int N = Integer.parseInt(br.readLine());

        if (N > 14) {
            N = N % 14;
            if (N == 0) N = 14; // % 결과가 0이면 마지막 문자로
        }

        char a = A.charAt(N - 1);
        bw.write(a + "");
        bw.flush();
        bw.close();
    }
}
