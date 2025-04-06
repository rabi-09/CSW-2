class Student<T>{
    String name;
    T rollNumber;
    int age;
    Student(String name, T rollNumber, int age){
        this.name=name;
        this.rollNumber=rollNumber;
        this.age=age;
    }
    void printDetails(){
        System.out.println("Student Name: "+name+" Roll Number is: "+rollNumber+" Age is: "+age);
    }
}
public class Q1 {
    public static void main(String[] args) {
        Student<Integer> s1  = new Student("Rabi", 1, 20);
        s1.printDetails();
        Student<String> s2  = new Student("Pratik", "2341013286", 20);
        s2.printDetails();
    }
}