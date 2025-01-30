import java.util.Scanner;
public class Main {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		int n = sc.nextInt();
		int x = sc.nextInt();
		
		int maxStart = -1;
		
		for(int i = 0; i < n; i++) {
			int s = sc.nextInt();
			int t = sc.nextInt();
			int total = s + t;
			if(total <= x && maxStart < s) {
				maxStart = s;
			}
		}
		
		System.out.println(maxStart);
		sc.close();
	}
}