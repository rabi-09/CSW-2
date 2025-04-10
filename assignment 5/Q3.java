import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Choice\n1.Append\n2.Insert\n3.Delete\n4.Reverse\n5.Replace");
        int choice = sc.nextInt();
        System.out.println("enter initial String");
        StringBuffer sb = new StringBuffer(sc.next());
        switch (choice) {
            case 1:
                System.out.println("Enter the string");
                String s1 = sc.next();
                sb.append(s1);
                break;
            case 2:
                System.out.println("Enter the string and index");
                String s2 = sc.next();
                int i = sc.nextInt();
                sb.insert(i, s2);
                break;
            case 3:
                System.out.println("Enter the two indices");
                int j=sc.nextInt(), k=sc.nextInt();
                sb.delete(j, k);
                break;
            case 4:
                sb.reverse();
                break;
                
            case 5:
                System.out.println("Enter the two indices and string");
                int l=sc.nextInt(), m=sc.nextInt();
                String s5 = sc.next();
                sb.replace(l, m, s5);
                break;
            default:
                System.out.println("Invalid choice");
        }
        System.out.println(sb);
        System.out.println(sb.capacity()+" "+sb.length());
    }
}
