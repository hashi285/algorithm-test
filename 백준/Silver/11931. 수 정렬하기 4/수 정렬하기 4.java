import java.io.*;
import java.util.Arrays;
import java.util.Collections;


public class Main{
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int i = Integer.parseInt(br.readLine());  // 입력의 첫 번째 줄에서 숫자 개수를 읽음
        Integer[] qw = new Integer[i];  // 기본형 int[] 대신 Integer[] 배열 사용
        for (int k = 0; k < i; k++) {
            qw[k] = Integer.parseInt(br.readLine());  // 숫자를 배열에 저장
        }

        // 내림차순 정렬
        Arrays.sort(qw, Collections.reverseOrder());

        // 배열을 출력
        for (int num : qw) {
            bw.write(num + "\n");
        }
        bw.flush();
        bw.close();
        br.close();
    }
}