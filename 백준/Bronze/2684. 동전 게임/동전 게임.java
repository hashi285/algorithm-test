import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        for (int i = 0; i < N; i++) {
            StringBuilder sb = new StringBuilder(br.readLine());

            int A1 = 0;
            int A2 = 0;
            int A3 = 0;
            int A4 = 0;
            int A5 = 0;
            int A6 = 0;
            int A7 = 0;
            int A8 = 0;

            for (int k = 0; k < 38; k++) {
                String a = "" + sb.charAt(k) + sb.charAt(k + 1) + sb.charAt(k + 2);

                // 기존 switch 문법 사용
                switch (a) {
                    case "TTT":
                        A1++;
                        break;
                    case "TTH":
                        A2++;
                        break;
                    case "THT":
                        A3++;
                        break;
                    case "THH":
                        A4++;
                        break;
                    case "HTT":
                        A5++;
                        break;
                    case "HTH":
                        A6++;
                        break;
                    case "HHT":
                        A7++;
                        break;
                    case "HHH":
                        A8++;
                        break;
                }
            }

            bw.write(A1 + " " + A2 + " " + A3 + " " + A4 + " " + A5 + " " + A6 + " " + A7 + " " + A8 + "\n");
        }
        bw.flush();
        bw.close();
    }
}
