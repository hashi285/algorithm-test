
import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());

        int A = M - N;

        if (A <= 0){
            bw.write("Congratulations, you are within the speed limit!");
        } else if (A <= 20) {
            bw.write("You are speeding and your fine is $100.");
        } else if (A <= 30) {
            bw.write("You are speeding and your fine is $270.");
        }else bw.write("You are speeding and your fine is $500.");
        bw.flush();
        bw.close();
    }
}
