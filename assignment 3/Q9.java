import java.util.InputMismatchException;
import java.util.Scanner;

public class Q9 {
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        try{
            System.out.println("Enter and Integer");
            int num = sc.nextInt();
            System.out.println("Integer input is: "+num);
        }
        catch (InputMismatchException i){
            System.out.println("ERROR:\n"+i);
        }
    }
}
