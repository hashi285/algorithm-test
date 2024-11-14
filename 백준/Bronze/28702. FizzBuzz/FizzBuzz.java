import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));


        int n = 0;

        for (int i = 1; i <= 3; i++){
            String b = br.readLine();
            if (!b.equals("Fizz") && !b.equals("Buzz") && !b.equals("FizzBuzz")){
                n = Integer.parseInt(b);
                switch (i){
                        case 1:
                            n = n + 3; break;
                        case 2:
                            n = n + 2; break;
                        case 3:
                            n = n + 1; break;
                }
                if (n % 3 == 0 && n % 5 == 0){
                    bw.write("FizzBuzz");
                }else if (n % 3 == 0 ){
                    bw.write("Fizz");
                }else if (n % 5 == 0){
                    bw.write("Buzz");
                }else { bw.write(n + "\n");}
                break;
            }
        }
        bw.flush();
        bw.close();
        br.close();
    }
}
