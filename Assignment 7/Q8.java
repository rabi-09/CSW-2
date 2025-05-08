import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q8 {
    public static void main(String[] args) {
        LocalDateTime ldt = LocalDateTime.now();
        DateTimeFormatter df = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");
        String date = ldt.format(df);
        System.out.println("Current date is: " + date);
    }
}
