import java.io.*;

public class Main  {
    BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
    public void es(int n) throws IOException {

        for (int i = 0; i < n; i++) {
            if (i != 0) {
                bw.write("\n");
            }
            for (int j = 0; j < n; j++) {
                bw.write("@@@@@");
            }
        }
        bw.write("\n");
        bw.flush();
    }

    public void sm(int n) throws IOException {
        for (int i = 0; i < n; i++) {
            if (i != 0) {
                bw.write("\n");
            }
            for (int j = 0; j < n; j++) {
                bw.write("@");
            }
        }
        bw.write("\n");
        bw.flush();
    }
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        Main b = new Main();

        int n = Integer.parseInt(br.readLine());

            b.es(n);
            b.sm(n);
            b.es(n);
            b.sm(n);
            b.es(n);
        bw.flush();


    }
}
