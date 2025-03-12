import java.io.*;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int B = 0; // 수의 합

       ArrayList<Integer> set = new ArrayList<Integer>();

        while (N--> 0) {
            int K = Integer.parseInt(br.readLine());
            if (K == 0) {
                set.remove(set.size() - 1);
            } else set.add(K);

        }

            for(Integer i : set){
                B += i;
            }

            bw.write(B + "\n");
            bw.flush();
            bw.close();
    }
}
