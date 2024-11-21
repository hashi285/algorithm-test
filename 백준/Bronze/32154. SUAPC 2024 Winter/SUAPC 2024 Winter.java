import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int a = Integer.parseInt(br.readLine());

        switch (a){
            case 1 : bw.write("11" + "\n"); bw.write("A B C D E F G H J L M"); break;
            case 2 : bw.write("9" + "\n"); bw.write("A C E F G H I L M");break;
            case 3 : bw.write("9" + "\n"); bw.write("A C E F G H I L M");break;
            case 4 : bw.write("9" + "\n"); bw.write("A B C E F G H L M");break;
            case 5 : bw.write("8" + "\n"); bw.write("A C E F G H L M");break;
            case 6 : bw.write("8" + "\n"); bw.write("A C E F G H L M");break;
            case 7 : bw.write("8" + "\n"); bw.write("A C E F G H L M");break;
            case 8 : bw.write("8" + "\n"); bw.write("A C E F G H L M");break;
            case 9 : bw.write("8" + "\n"); bw.write("A C E F G H L M");break;
            case 10 : bw.write("8" + "\n"); bw.write("A B C F G H L M");break;
        }
        bw.flush();
        bw.close();
    }
}