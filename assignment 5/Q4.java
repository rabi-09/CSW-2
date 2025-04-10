import java.util.Scanner;

public class Q4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter intial string");
        StringBuilder sb = new StringBuilder(sc.next());
        System.out.println("Before: "+sb);
        while(true){
            System.out.println("Enter Choice\n1.Add Substring\n2.Remove range of Char\n3.Modify at Index\n4.Concate\n0 for stop");
            int choice = sc.nextInt();
            if(choice==0)
                break;
            switch (choice) {
                case 1:
                    System.out.println("Enter a String and index");
                    String s1 = sc.next();
                    int i=sc.nextInt();
                    sb.insert(i, s1);
                    break;
                case 2:
                    System.out.println("Enter a indices to delet");
                    int j=sc.nextInt(), k=sc.nextInt();
                    sb.delete(j, k);
                    break;
                case 3:
                    System.out.println("Enter a char and index");
                    char c = sc.next().charAt(0);
                    int l=sc.nextInt();
                    sb.deleteCharAt(l);
                    sb.insert(l, c);
                    break;
                case 4:
                    System.out.println("Enter a String");
                    String s4 = sc.next();
                    sb.append(s4);
                    break;
                default:
                    System.out.println("Invalid choice");
                    break;
            }
            System.out.println("After: "+sb);
        }
    }
}
