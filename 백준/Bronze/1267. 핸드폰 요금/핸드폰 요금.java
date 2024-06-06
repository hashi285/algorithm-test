import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        int[] A ;
        A = new int[i];
        for (int j = 0; j < i; j++) {
            int B =sc.nextInt();
           A[j] = B;
        }

        int myogum = 0;
        int yyogum = 0;

        for (int j = 0; j < i; j++) {
            int minsic = A[j];
            int youngsik = A[j];

            //민식 요금

            myogum += (minsic/60*15)+15;

            //영식 요금

            yyogum += (youngsik/30*10)+10;
        }

            if (yyogum > myogum){
                System.out.print("M ");
                System.out.println(myogum);
            } else if (yyogum < myogum) {
                System.out.print("Y ");
                System.out.println(yyogum);
            }else {
                System.out.print("Y M ");
                System.out.println(yyogum);
            }








    }
}
