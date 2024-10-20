import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        if (a >= 90)
            bw.write("A" + "\n");
        else if (a >= 80) {
            bw.write("B" + "\n");
        } else if (a >= 70) {
            bw.write("C" + "\n");
        } else if (a >= 60) {
            bw.write("D" + "\n");
        } else if (a < 60)
            bw.write("F" + "\n");
        
                bw.flush();
        bw.close();
    }
}
