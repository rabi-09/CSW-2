import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Q11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            FileWriter fw = new FileWriter("diary.txt", true);
            System.out.println("Enter your diary entry:");
            String s = sc.nextLine();
            LocalDate d = LocalDate.now();
            fw.write("\n"+d+" : "+s);
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
