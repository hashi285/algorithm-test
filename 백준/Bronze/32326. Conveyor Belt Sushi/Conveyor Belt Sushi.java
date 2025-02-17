import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int A = 0;
        int B = 0;

        for (int i = 1; i <= 3; i++){
            A = Integer.parseInt(br.readLine());
            if (i == 1){
                B += A*3;
            }else if (i == 2){
                B += A*4;
            }else if (i == 3){
                B += A*5;
            }
        }
        bw.write(B + "\n");
        bw.flush();
        bw.close();
    }
}
