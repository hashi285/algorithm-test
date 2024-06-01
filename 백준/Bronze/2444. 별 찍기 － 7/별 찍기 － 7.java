import java.util.Scanner;


public class Main {
    public static void main(String[] args) {
    Scanner in = new Scanner(System.in);
    int N = in.nextInt();
    for (int i = 1; i <= 2*N-1; i++) {

        if(i <= (2*N-1)/2+1) {
            for (int j = 1; j <= N-i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= 2*i-1; j++) {
                System.out.print("*");
            }
        }else{
            for (int j = 1; j <= i-N; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= (2*N-i)*2-1; j++) {
                System.out.print("*");
        }

    }
        System.out.println();
    }
}
}