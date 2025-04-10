import java.util.Scanner;

public class Q5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Two strings");
        String s1 = sc.next(), s2 = sc.next();
        s1 = s1.toLowerCase();
        s2 = s2.toUpperCase();
        System.out.println(s1+" "+s2);
        System.out.println(s1==s2);
    }    
}
