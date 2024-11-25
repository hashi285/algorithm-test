import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int m = 0; // 변수 n와 비교를 위해
        int n = Integer.parseInt(br.readLine());

        int a = 0; // 직접 더하면서 666을 찾을 변수
        String s = "";
        while (n > m){
            a++;
            s = String.valueOf(a);
            if (s.contains("666")){
                m++;
            }
        }
        bw.write(a + "\n");
        bw.flush();
        bw.close();
    }
}
