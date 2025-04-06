import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number");
        try{
            int num = sc.nextInt();
            System.out.println("Enter divisor to divide the number");
            int div = sc.nextInt();
            try{
                System.out.println("Division results: "+(num/div));
            }
            catch (ArithmeticException ae){
                System.out.println(ae);
            }
        }
        catch (NumberFormatException ne){
            System.out.println("ERROR: Enter a Valid Number");
        } catch (Exception e) {
            System.out.println("ERROR: Unexpected error occurred");
        }
    }
}
