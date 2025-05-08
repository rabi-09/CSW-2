
interface Function{
    int factorial(int num);
}

public class Q6 {
    public static Function factorial(){
        return num -> {
            int mul=1;
            for (int i = num; i > 0; i--) {
                mul *= i;
            }
            return  mul;
        };
    }
    public static void main(String[] args) {
        Function fun = factorial();
        System.out.println("Factorial is: "+fun.factorial(5));
    }
}
