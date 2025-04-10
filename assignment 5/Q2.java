public class Q2 {
    public static void main(String[] args) {
        String s = "Test";
        System.out.println(s);

        CharSequence c = s;
        s.concat("Demo");
        System.out.println(s+"\n"+c);
    }
}
