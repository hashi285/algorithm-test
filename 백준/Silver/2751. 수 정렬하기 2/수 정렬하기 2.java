
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
         BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            int N = Integer.parseInt(br.readLine());
            int[] arr = new int[N];
            for (int i = 0; i < N; i++){
                int a = Integer.parseInt(br.readLine());
                arr[i] = a;
            }
            Arrays.sort(arr);
            for (int i = 0; i < N; i++){
                bw.write(arr[i] + "\n");
            }
            bw.flush();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
