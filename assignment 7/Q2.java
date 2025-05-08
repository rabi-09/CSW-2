
import java.util.Scanner;

interface Calculator{
    int operate(int x, int y);
}

public class Q2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter two operands");
        int a = sc.nextInt();
        int b = sc.nextInt();
        Calculator add = (x, y) -> x+y;
        Calculator sub = (x, y) -> x-y;
        Calculator mul = (x, y) -> x*y;
        Calculator div = (x, y) -> {
            if(y!=0)
                return x/y;
            else throw new ArithmeticException("Can't divide by Zero");
        };
        
        System.out.println("Addition: "+add.operate(a, b));
        System.out.println("Subtraction: "+sub.operate(a, b));
        System.out.println("Multiplication: "+mul.operate(a, b));
        System.out.println("Division: "+div.operate(a, b));
        
    }
}
