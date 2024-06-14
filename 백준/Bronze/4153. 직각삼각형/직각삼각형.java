import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        try {
            while (true) {
                StringTokenizer st = new StringTokenizer(br.readLine());
                int x = Integer.parseInt(st.nextToken());
                int y = Integer.parseInt(st.nextToken());
                int z = Integer.parseInt(st.nextToken());

                if(x == 0 && y == 0 && z == 0) //0 0 0 값이 들어오면 반복문 끝
                    break;


                if(z * z == (x * x + y * y) ) { // z가 가장 큰 경우
                    System.out.println("right");
                }
                else if(x * x == (y * y + z * z)) { // x가 가장 큰 경우
                    System.out.println("right");
                }
                else if(y * y == (z * z + x * x)) { // y가 가장 큰 경우
                    System.out.println("right");
                }
                else {
                    System.out.println("wrong"); // 위의 모든 경우의 수가 거짓인 경우
                }
                bw.newLine();
            }
            bw.flush();
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}