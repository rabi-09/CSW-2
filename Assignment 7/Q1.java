
import java.util.Scanner;

interface StringProcessor{
    public int getInt(String str);
}
class Q1{
    public static void main(String[] args) {
        Scanner sc  = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        StringProcessor sp = (str)->{
            return str.length();
        };
        System.out.println(sp.getInt(s));
    }
}