import java.util.Scanner;

public class Q7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Sentance, Search word and replace word");
        String sen = sc.nextLine();
        String src = sc.nextLine();
        String rep = sc.nextLine();
        int i = sen.indexOf(src);
        String bef = sen.substring(0, i);
        String aft = sen.substring(i+src.length());
        System.out.println(bef + rep + aft);
    }
}
