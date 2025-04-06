import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student7{
    String name;
    int rollNo, age;
    Student7(String name, int rollNo, int age) {
        this.name = name;
        this.rollNo = rollNo;
        this.age = age;
    }
    public String toString(){
        return  "Name: "+name+", Roll Number: "+rollNo+", Age: "+age;
    }
}
class AgeComparator implements Comparator<Student7>{
    @Override
    public int compare(Student7 s1, Student7 s2) {
        return Integer.compare(s1.age,s2.age);
    }
}class RollNumberComparator implements Comparator<Student7>{
    @Override
    public int compare(Student7 s1, Student7 s2) {
        return Integer.compare(s1.rollNo,s2.rollNo);
    }
}
public class Q7 {
    public static void main(String[] args) {
        List<Student7> students = new ArrayList<>(5);
        students.add(new Student7("Rabi", 1,20));
        students.add(new Student7("Pratik", 3,21));
        students.add(new Student7("Smruti", 2,19));
        students.add(new Student7("Satya", 5,22));
        students.add(new Student7("Roshan", 4,19));

        Collections.sort(students,new AgeComparator());
        System.out.println("Age Sorting: ");
        for (Student7 s: students)
            System.out.println(s);
        Collections.sort(students,new RollNumberComparator());
        System.out.println("Roll Number Sorting: ");
        for (Student7 s: students)
            System.out.println(s);
    }
}
