import java.io.File;
import java.util.Scanner;

public class Q16 {
    public static void main(String[] args) {
         Scanner sc = new Scanner(System.in);
        System.out.println("Enter file path to rename");
        File f = new File(sc.nextLine());
        System.out.println(f.getName()+"\n"+f.length()+"\n"+f.lastModified()+"\nCan read: "+f.canRead()+"\nCan write: "+f.canWrite());
    }
}
