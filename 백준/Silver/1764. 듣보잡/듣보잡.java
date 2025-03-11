import java.io.*;
import java.util.Set;
import java.util.StringTokenizer;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int N = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        Set<String> set = new TreeSet<>();
        Set<String> set2 = new TreeSet<>();
        while (N-->0) set.add(br.readLine());
        while (M-->0) set2.add(br.readLine());


        Set<String> set3 = new TreeSet<>();

        for (String s : set) {
            if (set2.contains(s)) set3.add(s);
        }

        bw.write(set3.size() + "\n");

        for (String s : set3) bw.write(s + "\n");
        bw.flush();
        bw.close();
    }
}
