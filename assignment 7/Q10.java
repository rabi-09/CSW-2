import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;
import java.util.Scanner;

public class Q10 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter a Start Date");
        LocalDate start = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        System.out.println("Enter a End Date");
        LocalDate end = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));

        long days = ChronoUnit.DAYS.between(start, end);
        System.out.println("Days between "+start+" and "+end+" is: "+days);
    }
}
