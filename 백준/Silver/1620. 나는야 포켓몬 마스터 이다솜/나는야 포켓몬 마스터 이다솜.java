
import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int N = Integer.parseInt(st.nextToken()); //포켓몬의 개수 N
        int M = Integer.parseInt(st.nextToken()); //내가 맞춰야 하는 개수 M

        Map<Integer, String> map = new HashMap<>();
        Map<String, Integer> map2 = new HashMap<>();

        for (int i = 1; i <= N; i++){
            String aa = br.readLine();
            map.put(i, aa);
            map2.put(aa, i);
        }

        for (int i = 1; i <= M; i++){
            String A = br.readLine().trim();

            if (A.matches("\\d+")){
                int AA = Integer.parseInt(A);
                bw.write(map.get(AA) + "\n");
            }else if (A.matches("[a-zA-Z]+")){
                bw.write(map2.get(A) + "\n");
            }
        }
        bw.flush();
        bw.close();
    }
}
