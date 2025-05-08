
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Q7 {
    public static void main(String[] args) {
        LocalDateTime dt = LocalDateTime.now();
        System.out.println("Current Date Time : "+dt);
        System.out.println("Future Date Time : "+dt.plusWeeks(2));
        DateTimeFormatter df = DateTimeFormatter.ofPattern("MM-dd-yyyy");
        String date = dt.format(df);
        System.out.println("Current Date : "+date);

    }
}
