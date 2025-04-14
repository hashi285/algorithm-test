import java.io.*;
import java.util.Locale;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        while (true){
            StringBuilder sb = new StringBuilder(br.readLine());
            char a = sb.charAt(0);
            String aa = sb.deleteCharAt(0).toString();
            if (a == '#') break;
            else {
                int K = where(a, aa);
                System.out.println(K);
            }

        }
    }

    public static int where (char a ,String aa){
        int K = 0;
        String dd = String.valueOf(a);
        dd = dd.toUpperCase(Locale.ROOT);
        System.out.print(a + " ");

        for (int i = 0; i < aa.length(); i++) {
            if(aa.charAt(i) == a || aa.charAt(i) == dd.charAt(0)){
                K++;
            }
        }
        return K;
    }
}
