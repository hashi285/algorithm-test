import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));





        int N = Integer.parseInt(br.readLine());


        while (N --> 0){
            StringBuilder sb = new StringBuilder();
            StringTokenizer st = new StringTokenizer(br.readLine());
            sb.append("god");
            st.nextToken();
            while(st.hasMoreTokens()){
                sb.append(st.nextToken());
            }
            bw.write(sb + "\n");
        }
        bw.flush();
        bw.close();
    }
}
