import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        int b = a/5*5; // 5의 최대배수

        int m = 0; //

        while (true){
            if (b >= 0 && (a - b) % 3  == 0) {m = (a - b) / 3; bw.write(m + (a-(m*3))/5 +"\n"); break;}
            else if (b < 0) { bw.write("-1"); break;}
            else b -= 5;
        }
        
        bw.flush();
    }
}
