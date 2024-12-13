import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String input = br.readLine();
        int divisor = 20000303;

        // 나머지를 계산
        int remainder = 0;
        for (int i = 0; i < input.length(); i++) {
            remainder = (remainder * 10 + (input.charAt(i) - '0')) % divisor;
        }

        bw.write(remainder + "\n");
        bw.flush();
        bw.close();
    }
}