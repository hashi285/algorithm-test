import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken());

        if (n == 1) bw.write("12" + " 1600" + "\n");
        else if (n == 2) bw.write("11" + " 894" + "\n");
        else if (n == 3) bw.write("11" + " 1327" + "\n");
        else if (n == 4) bw.write("10" + " 1311" + "\n");
        else if (n == 5) bw.write("9" + " 1004" + "\n");
        else if (n == 6) bw.write("9" + " 1178" + "\n");
        else if (n == 7) bw.write("9" + " 1357" + "\n");
        else if (n == 8) bw.write("8" + " 837" + "\n");
        else if (n == 9) bw.write("7" + " 1055" + "\n");
        else if (n == 10) bw.write("6" + " 556" + "\n");
        else if (n == 11) bw.write("6" + " 773" + "\n");

        bw.flush();
        bw.close();
    }
}
