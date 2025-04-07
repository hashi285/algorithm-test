import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        int[] b = new int[a];

        int c = 0;
        int count = 0;

        for (int i = 0; i < a; i++){
            b[i] = Integer.parseInt(br.readLine());
        }

        for (int i = a - 1; i >= 0; i--){
            if (c < b[i]){
                c = b[i];
                count++;
            }
        }
        bw.write(count + "\n");
        bw.flush();
        bw.close();
    }
}
