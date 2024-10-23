import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        String a = st.nextToken();

        if (a.equals("M") ) bw.write("MatKor" + "\n");
        else if (a.equals("W")) bw.write("WiCys" + "\n");
        else if (a.equals("C")) bw.write("CyKor" + "\n");
        else if (a.equals("A")) bw.write("AlKor" + "\n");
        else if (a.equals("$")) bw.write("$clear" + "\n");

        bw.flush();
        bw.close();
    }
}
