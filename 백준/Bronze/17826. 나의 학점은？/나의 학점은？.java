import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {


        // 배열의 모든 수를 정렬을 하지 않고, 홍익이의 점수보다 큰 수부터 정렬을 하며, 혹익이의 학점을 출력을 하는 방식 (모든 수를 절렬을 하지 않아도 풀 수 있는 문제다.)
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        int[] arr = new int[50];
        for (int i = 0; i < 50; i++) arr[i] = Integer.parseInt(st.nextToken());

        int n = Integer.parseInt(br.readLine());

        int i = 0;

        for (; i < 50; i++) {
            if (arr[i] <= n) break;
        }
        i++;
        if (i<=5) System.out.println("A+");
        else if (i<=15) System.out.println("A0");
        else if (i<=30) System.out.println("B+");
        else if (i<=35) System.out.println("B0");
        else if (i<=45) System.out.println("C+");
        else if (i<=48) System.out.println("C0");
        else System.out.println("F");

    }
}
