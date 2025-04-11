import java.io.*;
import java.util.Arrays;
import java.util.StringTokenizer;

public class Main {
    static int c = 0; //  가장 많은 상금을 받은 사람의 상금
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine()); // 참여하는 사람의 수
        int[] A = new int[3];

        for (int i = 0; i < N; i++) {

            StringTokenizer st = new StringTokenizer(br.readLine());

            for (int k = 0; k < 3; k++) {
                A[k] = Integer.parseInt(st.nextToken());
            }

            int s = money(A);
            if (c < s){
                c = s;
            }
        }
        bw.write(c + "\n");
        bw.flush();
    }


    public static int money (int[] a){
        int k = 0;
        if (a[0] == a[1] && a[0] == a[2]){
            k = 10000 + a[1] * 1000;
        } else if (a[0] == a[1]) {
            k = 1000 + a[0] * 100;
        } else if (a[0] == a[2]) {
            k = 1000 + a[0] * 100;
        } else if (a[1] == a[2]) {
            k = 1000 + a[1] * 100;
        } else {
            int v = Arrays.stream(a).max().getAsInt();
            k = 100 * v;
        }
        return k;
    }
}
