import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] a = new int[5];
        for (int i = 0; i < 5; i++){
            a[i] = sc.nextInt();
        }
        Arrays.sort(a);
        int sum = Arrays.stream(a).sum();
        System.out.println(sum/5);
        System.out.println(a[2]);
    }
}