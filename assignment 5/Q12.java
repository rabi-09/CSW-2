import java.io.File;
import java.util.Scanner;

public class Q12 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path");
        String fp = sc.nextLine();
        File f = new File(fp);
        if(!f.exists())
            System.out.println("File not exists");
        else
            System.out.println("File exists");

    }
}
