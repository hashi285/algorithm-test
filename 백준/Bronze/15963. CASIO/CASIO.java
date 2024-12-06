import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());
        long student = Long.parseLong(st.nextToken());
        long teacher = Long.parseLong(st.nextToken());
        if(student == teacher) bw.write("1");
        else bw.write("0");

        bw.flush();
        bw.close();
    }
}
