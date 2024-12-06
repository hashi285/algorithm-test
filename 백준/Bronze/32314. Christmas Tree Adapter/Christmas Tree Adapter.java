import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st1 = new StringTokenizer(br.readLine());
        StringTokenizer st2 = new StringTokenizer(br.readLine());
        int a = Integer.parseInt(st1.nextToken());
        int w = Integer.parseInt(st2.nextToken());
        int v = Integer.parseInt(st2.nextToken());
        
        if (w >= a * v) bw.write("1");
        else bw.write("0");
        
        bw.flush();
        bw.close();
    }
}
