import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String line;
        while ((line = reader.readLine()) != null) { // 입력이 null일 때 EOF
            System.out.println(line); // 입력된 줄을 그대로 출력
        }
    }
}
