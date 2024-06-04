import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        for(int i = 1; i <= 2*N-1; i++){

            if (i <= N) {

                for (int j = 1; j < i ; j++) {
                    System.out.print(" ");
                }

                for (int l = 1; l <= 2*N - (2*i - 1); l++) {
                    System.out.print("*");
                }

            }else {
                for (int h =1; h <= 2*N - i - 1; h++){
                    System.out.print(" ");
                }

                for (int k = 1; k <= (2*i) - 2*N + 1; k++) {
                    System.out.print("*");
                }
            }
            System.out.println();
        }
    }
}