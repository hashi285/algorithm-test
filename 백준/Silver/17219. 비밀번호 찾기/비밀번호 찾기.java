import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken()); // 저장된 사이트의 주소
        int M = Integer.parseInt(st.nextToken()); // 비밀번호를 찾으려고 하는 사이트의 수

        Map<String, String> site = new HashMap<>(); // 사이트 주소, 해당 사이트 비밀번호


        while (N-->0){ // Map에 사이트 url과 비밀번호를 저장
            StringTokenizer st2 = new StringTokenizer(br.readLine());
            site.put(st2.nextToken(), st2.nextToken());
        }

        while (M-->0){ //url를 이용하여 비밀번호를 찾는다.
            bw.write(site.get(br.readLine()) + "\n");
        }

        bw.flush();
        bw.close();
    }
}
