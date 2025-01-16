import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String A = br.readLine();

        if (A.equals("n") || A.equals("N")){
            bw.write("Naver D2" + "\n");
        }else {
            bw.write("Naver Whale" + "\n");
        }

        br.close();
        bw.flush();
        bw.close();
    }
}
