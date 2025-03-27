import java.io.*;
import java.util.LinkedHashMap;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        StringTokenizer st ;
        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];
        st = new StringTokenizer(br.readLine());
        LinkedHashMap<Integer, Integer> map = new LinkedHashMap<>();

        for (int i = 0; i < N; i++) {
            A[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());
        st = new StringTokenizer(br.readLine());

        for (int i = 0; i < M; i++) {
            int a = Integer.parseInt(st.nextToken());
            map.put(a, 0);
        }
        for (int i = 0; i < N; i++) {
            if (map.containsKey(A[i])) {
                map.put(A[i], 1);
            }
        }
        for (int value : map.values()) {
            System.out.print(value + " ");

        }

    }
}