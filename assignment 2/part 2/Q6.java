import java.util.Scanner;
import java.util.TreeSet;

public class Q6 {
    public static void main(String[] args) {
        TreeSet<Integer> ts = new TreeSet<>();
        ts.add(1);
        ts.add(5);
        ts.add(9);
        ts.add(4);
        ts.add(3);
        System.out.println(ts);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a Number to check whether exists or not");
        int ele = sc.nextInt();
        if(ts.contains(ele))
            System.out.println(ele+" Exists");
        else
            System.out.println(ele+" not exists");

        System.out.println("Enter a Number to delete");
        int delEle = sc.nextInt();
        if(ts.contains(delEle)){
            ts.remove(delEle);
            System.out.println(delEle+" deleted successfully");
        }
        else
            System.out.println(ele+" not exists");
        System.out.println(ts);
    }
}
