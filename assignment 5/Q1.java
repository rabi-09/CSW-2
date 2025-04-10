class Q1{
    public static void main(String[] args) {
        String s1 = "Rabi";
        String s2 = "Rabi";
        String s3 = new String("Rabi");

        System.out.println(s1==s2);
        System.out.println(s2==s3);
        System.out.println(s3==s1);
    }
}