import java.io.*;
import java.math.BigInteger;

public class Main {

    static BigInteger factorial(int start, int end) {
        if (start > end) return BigInteger.ONE;
        if (start == end) return BigInteger.valueOf(start);
        if (end - start == 1) {
            return BigInteger.valueOf(start).multiply(BigInteger.valueOf(end));
        }
        int mid = (start + end) / 2;
        return factorial(start, mid).multiply(factorial(mid + 1, end));
    }

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int n = Integer.parseInt(br.readLine());
        BigInteger result = factorial(1, n);
        System.out.println(result);
    }
}