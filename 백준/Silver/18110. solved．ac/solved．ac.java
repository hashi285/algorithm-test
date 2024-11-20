
import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine()); // 난이도 의견의 개수
        int[] b = new int[a]; // 난이도 의견을 넣을 배열 b

        for (int i = 0; i < a ; i++){ // for 문을 이용하여, 배열에 난이도의 의견을 넣는다.
            b[i] = Integer.parseInt(br.readLine());
        }

        Arrays.sort(b); // 배열을 내림차순으로 재배열 한다.
        double n = 0.15 * a; // 철사평균을 계산한다.
        int m = (int) Math.round(n); // 위에서 나온 철사평균 값을 반올림을 한다.

        int left = m; // 철사평균을 구할 배열의 첫 부분
        int right = a - m - 1; // 철사평균을 구할 배열의 마지막 부분
        double k = 0; // 철사평균에 들어가는 값을 모두 합한 값
        double i = 0; // 철사평균에 들어가는 값의 수

        while (left <= right){ // 철사평균에 들어가는 수를 모두 합한다.
            k += b[left];
            left++;
            i++;
        }


        int ii = (int)Math.round(k/i); // double 형의 평균 값을 int 형으로 변환

        bw.write(ii + "\n");
        bw.flush();
        bw.close();
        br.close();
    }
}
