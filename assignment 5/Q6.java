import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc  =new Scanner(System.in);
        System.out.println("Enter a String");
        String s = sc.next();
        char[] ch = s.toCharArray();
        System.out.println("Enter a char to search");
        char c = sc.next().charAt(0);
        if(s.indexOf((int)c) != -1){
            System.out.println("First Occurance is: "+s.indexOf((int)c));
            System.out.println("Last Occurance is: "+s.lastIndexOf((int)c));
        }else
            System.out.println("No char found");
    }
}
