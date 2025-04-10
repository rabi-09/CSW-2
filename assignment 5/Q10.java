import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Q10 {
    public static void main(String[] args) {
        try {
            FileReader fr = new FileReader("diary.txt");
            try {
                int data = fr.read();
                while (data != -1) {
                    System.out.print((char) data);
                    data = fr.read();
                }
            } catch (IOException e) {
                System.out.println(e);
            }
            
        } catch (FileNotFoundException e) {
            System.out.println(e);
        }

    }
}
