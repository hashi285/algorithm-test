import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = 0;
        for (int i = 0; i < 4; i++){
            A += Integer.parseInt(br.readLine());
        }
        if (A <= 1500){
            bw.write("Yes" + "\n");
        } else {
            bw.write("No" + "\n");
        }

        bw.flush();
        bw.close();
    }
}
