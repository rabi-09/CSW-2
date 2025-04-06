import java.util.Scanner;

class CustomNullPointerException extends Exception{
    CustomNullPointerException(String str){
        super(str);
    }
}
public class Q2 {
    public static void main(String[] args) throws CustomNullPointerException {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String");
        String str = sc.nextLine();
        if(str.isEmpty())
            throw new CustomNullPointerException("String can't be EMPTY");
        System.out.println("String entered is: "+str);

    }
}
