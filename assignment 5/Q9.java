import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDate;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        File f = new File("diary.txt");
        if(f.exists()){
            System.out.println("File exists");
            return;
        }
        try {
            FileWriter fw  = new FileWriter(f);
            System.out.println("Enter your diary entry:");
            String s = sc.next();
            LocalDate d = LocalDate.now();
            fw.write(d+" : "+s);
            fw.close();
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
