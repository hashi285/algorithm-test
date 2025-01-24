import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int A = Integer.parseInt(br.readLine());

        for (int i = 0; i < A ; i++){
            String B = br.readLine();

            if (B.equals("Algorithm")){
                bw.write("204" + "\n");
            }else if (B.equals("DataAnalysis")){
                bw.write("207" + "\n");
            }else if (B.equals("ArtificialIntelligence")){
                bw.write("302" + "\n");
            }else if (B.equals("CyberSecurity")){
                bw.write("B101" + "\n");
            }else if (B.equals("Network")){
                bw.write("303" + "\n");
            }else if (B.equals("Startup")){
                bw.write("501" + "\n");
            }else if (B.equals("TestStrategy")) {
                bw.write("105" + "\n");
            }
        }

        bw.flush();
    }
}
