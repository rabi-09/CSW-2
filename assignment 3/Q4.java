import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner  sc = new Scanner(System.in);
        System.out.println("Enter a Number to find Square Root");
        try{
            int num = sc.nextInt();
            System.out.println("Sqaure Root is: "+Math.sqrt(num));
        }
        catch (ArithmeticException ae){
            ae.getMessage();
        } catch (Exception e) {
            System.out.println("ERROR: Unexpected Error Occurred");
        }
    }
}
