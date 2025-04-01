import java.io.*;
import java.util.HashMap;
import java.util.Map;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int M = Integer.parseInt(br.readLine());

        while (M-- > 0) {
            int N = Integer.parseInt(br.readLine());
            Map<String, Integer> map = new HashMap<>();
            while (N-- > 0) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                st.nextToken();
                String s = st.nextToken();
                if (map.containsKey(s)) {
                    map.put(s, map.get(s) + 1);
                }else {
                    map.put(s, 1);
                }
            }
            int c = 1;
            for (String s : map.keySet()) {
                c *= map.get(s) + 1;

            }
            bw.write(c - 1 + "\n");
            bw.flush();
        }

    }

}