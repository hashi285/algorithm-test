import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // 정수 세 개 입력받기
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();

        // 가장 작은 수, 중간 수, 가장 큰 수 찾기
        int smallest, middle, largest;

        if (a <= b && a <= c) {
            smallest = a;
            if (b <= c) {
                middle = b;
                largest = c;
            } else {
                middle = c;
                largest = b;
            }
        } else if (b <= a && b <= c) {
            smallest = b;
            if (a <= c) {
                middle = a;
                largest = c;
            } else {
                middle = c;
                largest = a;
            }
        } else {
            smallest = c;
            if (a <= b) {
                middle = a;
                largest = b;
            } else {
                middle = b;
                largest = a;
            }
        }

        // 결과 출력
        System.out.println(smallest + " " + middle + " " + largest);
    }
}
