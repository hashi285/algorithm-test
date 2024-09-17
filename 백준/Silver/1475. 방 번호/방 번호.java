import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main{
    public static void main(String[] args) throws IOException {
        // BufferedReader를 사용하여 입력을 받기 위한 설정
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        // 방 번호를 문자열로 입력받음
        String s = br.readLine();

        // 각 숫자의 개수를 저장할 배열 (0~9까지의 숫자)
        int[] arr = new int[10];

        // 입력된 문자열의 각 문자에 대해 반복
        for (int i = 0; i < s.length(); i++) {
            // 현재 문자를 숫자로 변환
            int num = Character.getNumericValue(s.charAt(i));

            // 숫자가 6인 경우, 9와 함께 처리하기 위해 arr[9]를 증가
            if (num == 6) {
                arr[9]++;
            } else {
                // 해당 숫자의 개수를 증가
                arr[num]++;
            }
        }

        // 가장 많이 사용된 숫자의 개수를 찾기 위한 변수
        int max = 0;

        // 0부터 8까지의 숫자 중 최대 개수를 찾음
        for (int i = 0; i < 9; i++) {
            max = Math.max(max, arr[i]);
        }

        // 6과 9의 개수를 반으로 나누어 처리 (6과 9는 같은 개수로 취급)
        int nine = arr[9] / 2;
        // 만약 9의 개수가 홀수이면 한 개 더 추가
        if (arr[9] % 2 == 1) nine++;

        // 6과 9의 최대 개수를 포함하여 최종 최대 개수를 계산
        max = Math.max(max, nine);

        // 결과 출력
        System.out.print(max);
    }
}
