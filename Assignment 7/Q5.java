
interface FunctionInterface{
    int square(int a);
}

public class Q5 {
    public static FunctionInterface sqFunc(){
        return a -> a*a;
    }
    public static void main(String[] args) {
        FunctionInterface f = sqFunc();
        System.out.println("Suare is: "+f.square(5));
    }
}
