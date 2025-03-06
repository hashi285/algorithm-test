import java.io.*;
import java.math.BigInteger;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        BigInteger b = new BigInteger(st.nextToken());
        BigInteger c = new BigInteger(st.nextToken());



        bw.write(b.multiply(c) + "\n");
        bw.flush();
        bw.close();
    }
}

