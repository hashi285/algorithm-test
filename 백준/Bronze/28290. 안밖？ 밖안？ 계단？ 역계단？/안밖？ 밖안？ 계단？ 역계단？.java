import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        String 답 = st.nextToken();

        String 안밖 = "fdsajkl;";
        String 안밖2 = "jkl;fdsa";
        String 밖안 = "asdf;lkj";
        String 밖안2 = ";lkjasdf";
        String 계단 = "asdfjkl;";
        String 역계단 = ";lkjfdsa";


        if (답.equals(안밖) || 답.equals(안밖2)){
            bw.write("in-out" + "\n");
        } else if (답.equals(밖안) || 답.equals(밖안2)) {
            bw.write("out-in" + "\n");
        } else if (답.equals(계단)) {
            bw.write("stairs" + "\n");
        } else if (답.equals(역계단)) {
            bw.write("reverse" + "\n");
        } else {
            bw.write("molu" + "\n");
        }

        bw.flush();
        bw.close();
    }
}
