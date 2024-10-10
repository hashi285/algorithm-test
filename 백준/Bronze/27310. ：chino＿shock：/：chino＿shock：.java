import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String word = st.nextToken();

        int length = word.length();
        int colone = 0;
        int under = 0;

        for (int i = 0; i < length; i++) {
            char c = word.charAt(i);
            if (c == ':'){
                colone++;
            } else if (c == '_') {
                under++;
            }
        }
        bw.write(length +colone + (under * 5) + "\n");
        bw.flush();
        bw.close();
    }
}
