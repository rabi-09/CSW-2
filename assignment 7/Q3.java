
import java.util.Scanner;


interface CustomComparator{
    void sort(String [] str);
}
public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enterno of string ");
        int size= sc.nextInt();
        String [] arr = new String[size];
        System.out.println("Enter Strings");
        for(int i=0; i<size; i++)
            arr[i] = sc.nextLine();
        CustomComparator c = (a) -> {
            for(int i=0; i<a.length; i++){
                for (int j = 0; j < a.length-1; j++) {
                    if(a[j].length() < a[j+1].length()){
                        String temp = a[j];
                        a[j] = a[j+1];
                        a[j+1] = temp;
                    }
                }
            }
            for (String string : a) {
                System.out.print(string+" ");
            }
        };
        c.sort(arr);
    }
}
