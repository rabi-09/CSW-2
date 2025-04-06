import java.util.Scanner;

public class Q6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no of elements of the Array");
        int n = sc.nextInt();
        int [] arr = new int[n];
        System.out.println("Enter "+n+" elements to that array");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        try{
            sortArray(arr);
            System.out.println("Enter element to search in Array");
            int num = sc.nextInt();;
            searchArray(arr, num);
            System.out.println("Enter index to get element in Array");
            System.out.println("Element is: "+arr[sc.nextInt()]);
        }
        catch(ArrayIndexOutOfBoundsException a){
            System.out.println("Index Out of Bound Exception Occurred");
        }
    }
    public static void sortArray(int[] arr) throws ArrayIndexOutOfBoundsException{
        for (int i = 0; i < arr.length; i++) {
            for (int j = i+1; j < arr.length; j++) {
                if(arr[i]>arr[j]){
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
            }
        }
        for (int i : arr) {
            System.out.print(i+" ");
        }
        System.out.println();
    }
    public static void searchArray(int[] arr, int num) throws ArrayIndexOutOfBoundsException{
        boolean flag = false;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i] == num){
                System.out.println(num+" found at position "+(i+1));
                flag = true;
            }
        }
        if(!flag)
            System.out.println(num+" not found");
    }
}
