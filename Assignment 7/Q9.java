import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        final int INTEREST_RATE = 8;
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter Starting Date(YYYY-MM_DD) and Principle Amount");
        LocalDate startDate = LocalDate.parse(sc.next(), DateTimeFormatter.ofPattern("yyyy-MM-dd"));
        double principle  = sc.nextDouble();
        LocalDate curDate = LocalDate.now();
        int years = curDate.getYear() - startDate.getYear();
        double interest = (principle*years*INTEREST_RATE)/100;
        System.out.println("Interest Amount is: "+interest);
        System.out.println("Final Amount is: "+(principle+interest));
    }
}
