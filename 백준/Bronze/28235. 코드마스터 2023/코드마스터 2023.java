import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();
        switch (N) {
            case "SONGDO": bw.write("HIGHSCHOOL"); break;
            case "CODE" : bw.write("MASTER"); break;
            case "2023" : bw.write("0611"); break;
            case "ALGORITHM" : bw.write("CONTEST"); break;
        }
        bw.flush();
        bw.close();
    }
}
