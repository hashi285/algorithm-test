import java.io.*;
import java.util.StringTokenizer;

public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st = new StringTokenizer(br.readLine());

        int 최대공약수 = 0;
        int a = Integer.parseInt(st.nextToken());
        int b = Integer.parseInt(st.nextToken());
        int n = a;
        int m = b;


        if (a < b) { //변수 a는 변수 b 보다 무조건 크거나 같다.
            int temp = a;
            a = b;
            b = temp;
        }

        while (b != 0) {
            최대공약수 = a%b;
           a = b;
           b = 최대공약수;
        }



        bw.write(a + "\n");
        bw.write(n/a * m/a * a + "\n");
        bw.flush();

    }
}
