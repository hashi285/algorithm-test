import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = 0;
        int B = 4;

        while (B > 0){
            A += Integer.parseInt(st.nextToken());
            B--;
        }

        int C = Integer.parseInt(st.nextToken());
        int D = 0;

        while (true){
            if (A / 4 >= C){
                break;
            }else {
                A++;
                D++;
            }
        }

        br.close();
        bw.write(D + "\n");
        bw.flush();
        bw.close();

    }
}
