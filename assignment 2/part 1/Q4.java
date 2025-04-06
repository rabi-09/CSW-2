class Student4 implements Comparable<Student4> {
    String name;
    int rollNumber, mark;

    public Student4(String name, int rollNumber, int mark) { 
        this.name = name;
        this.rollNumber = rollNumber;
        this.mark = mark;
    }

    @Override
    public String toString() {
        return "Student4 name: " + name + " Roll Number: " + rollNumber + " Mark: " + mark;
    }

    @Override
    public int compareTo(Student4 o) {
        return Integer.compare(this.mark, o.mark);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (obj == null || getClass() != obj.getClass()) return false;
        Student4 Student4 = (Student4) obj;
        return this.rollNumber == Student4.rollNumber;
    }
}

public class Q4 {
    public static void main(String[] args) {
        Student4 s1 = new Student4("Rabi", 1, 95);
        Student4 s2 = new Student4("Pratik", 2, 89);
        Student4 s3 = new Student4("Smruti", 3, 93);
        Student4 s4 = new Student4("Naresh", 4, 85);

        if (s1.compareTo(s3) > 0)
            System.out.println(s1);
        else
            System.out.println(s3);

        Student4[] stud = {s1, s2, s3, s4};

        boolean found = false;
        for (Student4 s : stud) {
            if (s2.equals(s)) {
                System.out.println(s2);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Student4 not Found");
        }
    }
}
