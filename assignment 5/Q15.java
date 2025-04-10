import java.io.File;
import java.util.Scanner;

public class Q15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path to rename");
        File f = new File(sc.nextLine());
        System.out.println("Enter new file name");
        File nf = new File(sc.nextLine());
        f.renameTo(nf);
        System.out.println("Success");
    }
}
