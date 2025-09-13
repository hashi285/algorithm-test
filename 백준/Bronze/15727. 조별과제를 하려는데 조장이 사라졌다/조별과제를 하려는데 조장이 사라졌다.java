import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        
        int A = Integer.parseInt(br.readLine());
        
        if (A%5 == 0){
            bw.write(A/5 + "\n");
        }else if (A%5 >= 1){
            bw.write(A/5 + 1 + "\n");
        }
        bw.flush();
        bw.close();
    }
}
