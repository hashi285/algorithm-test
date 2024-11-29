import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int a = Integer.parseInt(br.readLine());

        for (int i = 1; i <= a; i++ ){
            String b = br.readLine();
            bw.write(b.charAt(0));
            bw.write(b.charAt(b.length() - 1) + "\n");
        }


        bw.flush();
        bw.close();
    }
}