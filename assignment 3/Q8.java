class CustomeCheckedException extends Exception{
    CustomeCheckedException(String str){
        super(str);
    }
}
public class Q8 {
    public static void main(String[] args) {
        try{
            int div = division(10,0);
            System.out.println("Division is: "+div);
        }
        catch (CustomeCheckedException c){
            System.out.println("ERROR: "+c);
        }
    }
    public static int division(int dividend, int divisor) throws CustomeCheckedException {
        if(divisor==0)
            throw new CustomeCheckedException("Divisor can't be ZERO");
        return dividend/divisor;
    }
}
