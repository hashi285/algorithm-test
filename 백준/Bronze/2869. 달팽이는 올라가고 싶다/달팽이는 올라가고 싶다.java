import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");

        int 올라간_거리 = Integer.parseInt(st.nextToken());
        int 내려간_거리 = Integer.parseInt(st.nextToken());
        int 나무막대_높이 = Integer.parseInt(st.nextToken());

        int 일 = (나무막대_높이 - 내려간_거리) / (올라간_거리 - 내려간_거리);
        if ((나무막대_높이 - 내려간_거리) % (올라간_거리 - 내려간_거리) != 0)
            일++;

        bw.write(일 + "\n");
        bw.flush();
    }
}

