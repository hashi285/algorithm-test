import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.time.ZoneId;
import java.time.ZonedDateTime;
import java.util.Calendar;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        ZonedDateTime now = ZonedDateTime.now(ZoneId.of("UTC"));
        Calendar calendar = Calendar.getInstance();
        int year = now.getYear();
        int month = now.getMonthValue();
        int day = now.getDayOfMonth();

        bw.write(year +"\n"+month +"\n"+day);
        bw.flush();
        bw.close();

    }
}
