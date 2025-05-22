import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String N = br.readLine();

        switch (N){
            case "NLCS" : bw.write("North London Collegiate School");break;
            case "BHA" : bw.write("Branksome Hall Asia");break;
            case "KIS" : bw.write("Korea International School");break;
            case "SJA" : bw.write("St. Johnsbury Academy"); break;
        }
        bw.flush();
        bw.close();
    }
}
