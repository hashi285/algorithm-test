import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        double A = Double.parseDouble(st.nextToken());
        double B = Double.parseDouble(st.nextToken());
        double C = Double.parseDouble(st.nextToken());

        double D = 0;
        double E = 0;

        D = (A*B)/C;
        E = (A/B)*C;


        bw.write((int)Math.max(D,E) + "\n");
        bw.flush();
        bw.close();
    }
}