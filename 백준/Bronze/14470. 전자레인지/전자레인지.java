import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        int A = Integer.parseInt(br.readLine()); // 초기 온도
        int B = Integer.parseInt(br.readLine()); // 목표 온도
        int C = Integer.parseInt(br.readLine()); // 얼어 있는 고기의 1도당 가열 시간
        int D = Integer.parseInt(br.readLine()); // 얼음 해동 시간
        int E = Integer.parseInt(br.readLine()); // 해동된 고기의 1도당 가열 시간

        int time = 0; // 총 소요 시간

        if (A < 0) { // 고기가 얼어있다면
            time += (-A) * C; // 0도까지 가열하는 시간
            time += D;         // 해동 시간
            time += B * E;     // 해동된 고기를 B도까지 가열하는 시간
        } else { // 이미 해동된 상태라면
            time += (B - A) * E; // 목표 온도까지 가열하는 시간
        }

        System.out.println(time);
    }
}
