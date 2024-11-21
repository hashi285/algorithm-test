import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int a = 0;
        while(true){
            String b = br.readLine();
            if (b == null || b.isEmpty()){
                break;
            }
            a++;
        }
        bw.write(a + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
