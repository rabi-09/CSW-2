class Student51 implements Comparable<Student51>{
    String name;
    int rollNumber, totalMark;
    Student51(String name, int roll, int mark){
        this.name=name;
        rollNumber=roll;
        totalMark=mark;
    }
    Student51(){   
    }
    @Override
    public int compareTo(Student51 s) {
        return Integer.compare(this.rollNumber, s.rollNumber);
    }
    public void sortStudent51(Student51[] Student51s){
        for (int i = 0, n = Student51s.length; i < n - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (Student51s[j].rollNumber > Student51s[j + 1].rollNumber) {
                    Student51 temp = Student51s[j];
                    Student51s[j] = Student51s[j + 1];
                    Student51s[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break;
        }
        for (Student51 Student51 : Student51s) {
            System.out.println("Name: "+Student51.name+" Roll Number: "+Student51.rollNumber+" Total mark: "+Student51.totalMark);
        }
    }
}

public class Q5 {
    public static void main(String[] args) {
        Student51 s1 = new Student51("Rabi", 1, 96);
        Student51 s2 = new Student51("Pratik", 2, 97);
        Student51 s3 = new Student51("Smruti", 3, 92);
        Student51 s4 = new Student51("Naresh", 4, 91);
        Student51 s5 = new Student51("Shakti", 5, 86);
        Student51 [] s = {s4,s2,s1,s5,s3};
        Student51 Student51 = new Student51();
        Student51.sortStudent51(s);
    }
}
