import java.io.*;

public class Main {
    public static void main(String[] args)throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());
        while (A-->0){
            int B = Integer.parseInt(br.readLine());
            bw.write(B + " " + B + "\n");
        }
        bw.flush();
        bw.close();
    }
}
