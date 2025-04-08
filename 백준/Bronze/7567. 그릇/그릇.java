import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringBuilder sb = new StringBuilder(br.readLine());
        int N = 10;
        boolean M = true;
        if (sb.charAt(0) == '(') {
            M = true;
        }else if (sb.charAt(0) == ')') {
            M = false;
        }

        for (int i = 1; i < sb.length(); i++) {
            String a = String.valueOf(sb.charAt(i));
            if (a.equals("(") && M == true) {
                M = true;
                N += 5;
            }else if (a.equals("(") && M == false) {
                M = true;
                N += 10;
            }else if (a.equals(")") && M == true) {
                M = false;
                N += 10;
            }else if (a.equals(")") && M == false) {
                M = false;
                N += 5;
            }
        }
        bw.write(N + "\n");
        bw.flush();
        bw.close();
    }
}