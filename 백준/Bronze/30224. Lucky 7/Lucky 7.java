import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        String M = String.valueOf(N);

        if (M.contains("7") && N % 7 != 0){
            bw.write("2" + "\n");
        } else if (M.contains("7") && N % 7 == 0){
            bw.write("3" + "\n");
        } else if (N % 7 != 0){
            bw.write("0" + "\n");
        } else {
            bw.write("1" + "\n");
        }
        bw.flush();
        bw.close();
    }
}
