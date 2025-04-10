import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Q14 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter source and destination file path");
        File src = new File(sc.nextLine());
        File dest = new File(sc.nextLine());
        if(!src.exists()){
            System.out.println("Source not exists");
            return;
        }
        else{
            if(dest.exists()){
                System.out.println("Dest exists .. do you want to overwrite (y/n)");
                char c = sc.next().charAt(0);
                if(c=='y'){
                    FileReader s = new FileReader(src);
                    FileWriter d = new FileWriter(dest);
                    int ch;
                    while ((ch=s.read())!=-1) {
                        d.write(ch);
                    }
                    d.close();
                    s.close();
                }
            }
        }
        
    }
}
