import java.util.Scanner;

public class Q8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        System.out.println("Enter Choice\n1.Lowercase and Uppercase\n2.Search of char or index\n3.concatenate");
        int c = sc.nextInt();
        switch (c) {
            case 1:
                System.out.println(s.toLowerCase());
                System.out.println(s.toUpperCase());
                break;
            case 2:
                System.out.println("Enter a ch to find");
                char ch = sc.next().charAt(0);
                System.out.println(s.indexOf(ch));
                System.out.println("Enter a index to find");
                int i = sc.nextInt();
                System.out.println(s.charAt(i));
                break;
            case 3:
                System.out.println("Enter a string to concat");
                String scon = sc.next();
                System.out.println(s.concat(scon));  
                break;  
            default:
                System.out.println("Invalid Choice");
        }
    }
}
