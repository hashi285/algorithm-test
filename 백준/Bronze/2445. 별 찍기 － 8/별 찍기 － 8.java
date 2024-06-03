import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i = 1; i <= 2*N-1; i++){

            if (i <= N) {

                for (int j = 1; j <= N - (N - i); j++) {
                    System.out.print("*");
                }

                for (int k = 1; k <= 2 * N - (2 * i); k++) {
                    System.out.print(" ");
                }

                for (int l = 1; l <= N - (N - i); l++) {
                    System.out.print("*");
                }

            }else {
                for (int j = 1; j <= N-(i-N); j++) {
                    System.out.print("*");
                }

                for (int k = 1; k <= 2 * i - 2 * N; k++) {
                    System.out.print(" ");
                }

                for (int l = 1; l <= N-(i-N); l++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}