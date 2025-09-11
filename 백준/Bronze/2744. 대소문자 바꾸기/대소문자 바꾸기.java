
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < A.length(); i++) {
            if (Character.isUpperCase(A.charAt(i))) {
                sb.append(Character.toLowerCase(A.charAt(i)));
            } else {
                sb.append(Character.toUpperCase(A.charAt(i)));
            }
        }

        bw.write(sb.toString() + "\n");
        bw.flush();
    }
}
