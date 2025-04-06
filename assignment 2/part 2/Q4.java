import java.util.LinkedList;
import java.util.Objects;
import java.util.Scanner;

class Student{
    private String name;
    private int age, mark;

    public Student(String name, int age, int mark) {
        this.name = name;
        this.age = age;
        this.mark = mark;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getMark() {
        return mark;
    }

    public void setMark(int mark) {
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "name: " + name +", age: " + age + ", mark: " + mark ;
    }

    public boolean equals(Object o){
        if(this==o) return true;
        if(o==null || getClass()!=o.getClass()) return false;
        Student s = (Student)o;
        return (this.getAge()==s.getAge()) && (Integer.compare(getMark(), s.getMark()) == 0) && (Objects.equals(getName(),s.getName()));
    }
}

public class Q4 {
    public static void main(String[] args) {
        LinkedList<Student> studentList = new LinkedList<>();
        studentList.add(new Student("Rabi",20,98));
        studentList.add(new Student("Pratik",21,92));
        studentList.add(new Student("Smruti",19,96));
        studentList.add(new Student("Naresh",20,90));

        for (Student s: studentList)
            System.out.println(s);

        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a student details to check whether exists or not\nEnter Name");
        String name = sc.next();
        System.out.println("Enter Age and Mark");
        int age  = sc.nextInt(), mark = sc.nextInt();
        Student newS = new Student(name, age, mark);
        if(studentList.contains(newS))
            System.out.println("Student exists (content comparison)");
        else
            System.out.println("Student not exists");


        System.out.println("Enter a student details to delete from list\nEnter Name");
        name = sc.next();
        System.out.println("Enter Age and Mark");
        age  = sc.nextInt();
        mark = sc.nextInt();
        Student delS = new Student(name, age, mark);
        if(studentList.remove(delS))
            System.out.println("Student Deleted successfully");
        else
            System.out.println("Student not Found");

        System.out.println("Number of Students exists in the list: "+studentList.size());
    }
}
