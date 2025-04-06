import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a string to extract number from it");
        String str = sc.nextLine();
        StringBuilder str1= new StringBuilder();
        int num;
        for (int i = 0; i < str.length(); i++) {
            if(Character.isDigit(str.charAt(i)))
                str1.append(str.charAt(i));
        }
        try{
            num = Integer.parseInt(str1.toString());
            System.out.println("Number is: "+num);
        }
        catch (NumberFormatException ne) {
            System.out.println("ERROR: Enter a Valid String to find Number");
        }
        catch (Exception e) {
            System.out.println("Unexpected Error Occurred\n"+e);
        }
    }
}
