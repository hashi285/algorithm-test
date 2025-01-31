import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int ii = 0;

        for (int i = 0; i < 5; i++){
            StringBuilder st = new StringBuilder(br.readLine());
            int a = st.length(); //첩보원명의 길이
            for (int k = 0; k < a - 2; k++){
                String dd = String.valueOf(st.charAt(k));
                String aa = String.valueOf(st.charAt(k + 1));
                String bb = String.valueOf(st.charAt(k + 2));

                if (aa.equals("B") && bb.equals("I") && dd.equals("F")){
                    bw.write((i + 1) + "\n");
                    ii++;
                    break;
                }

            }
        }
        if (ii ==0) bw.write("HE GOT AWAY!" + "\n");

        bw.flush();
        bw.close();
    }
}
