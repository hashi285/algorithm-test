
import java.io.*;

public class Main {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        try {
            while (true) {
                boolean chk = true;
                String N = br.readLine();
                if (N.equals("0")) {
                    break;
                }else {
                    for (int i = 0; i <N.length()/2 ; i++) {
                        if (N.charAt(i) != N.charAt(N.length()-1-i)) {
                            chk = false;
                        }
                    }
                }
                if (chk){
                    bw.write("yes");
                    bw.newLine();
                }else {
                    bw.write("no");
                    bw.newLine();
                }
            }

            bw.flush();


        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}