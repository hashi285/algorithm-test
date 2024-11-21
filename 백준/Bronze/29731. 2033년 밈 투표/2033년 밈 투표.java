import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String a = "Never gonna give you up";
        String b = "Never gonna let you down";
        String c = "Never gonna run around and desert you";
        String d = "Never gonna make you cry";
        String e = "Never gonna say goodbye";
        String f = "Never gonna tell a lie and hurt you";
        String g = "Never gonna stop";

        int n = Integer.parseInt(br.readLine());
        int q = 0;
        for(int i = 0; i < n; i++){
            String m = br.readLine();
            if (m.equals(a) || m.equals(b) || m.equals(c) || m.equals(d) || m.equals(e) || m.equals(f)|| m.equals(g)){
                q++;
            }else {
                break;
            }
        }

        if (q == n){
            bw.write("No");
        }else bw.write("Yes");

        bw.flush();
        bw.close();

    }
}
