interface EnrollmentSystem{
    abstract void enroll(Stud s, Course c);
    abstract void drop(Stud s);
}
class Stud{
    private String name;
    private int rollNumber;
    Course course;

    public Stud(String name, int rollNumber) {
        this.name = name;
        this.rollNumber = rollNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getRollNumber() {
        return rollNumber;
    }

    public void setRollNumber(int rollNumber) {
        this.rollNumber = rollNumber;
    }

    public Course getCourse() {
        return course;
    }

    public void setCourse(Course course) {
        this.course = course;
    }

    @Override
    public String toString() {
        return " Student name: "+getName()+", Roll Number is: "+getRollNumber()+", "+getCourse();
    }
}
class Course{
    private String courseName;
    private String stream;

    public Course(String courseName, String stream) {
        this.courseName = courseName;
        this.stream = stream;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getStream() {
        return stream;
    }

    public void setStream(String stream) {
        this.stream = stream;
    }

    @Override
    public String toString() {
        return "Course Name is: "+getCourseName()+", Stream is: "+getStream();
    }
}
class Enrollment implements EnrollmentSystem{
    public void enroll(Stud s, Course c){
        s.setCourse(c);
    }
    @Override
    public void drop(Stud s) {
        s.setCourse(null);
    }
}
public class Q10 {
    public static void main(String[] args) {
        Stud s1 = new Stud("Rabi",1);
        Stud s2 = new Stud("Pratik",2);
        Course c1 = new Course("BTech","CSE");Course c2 = new Course("BTech","CS-IT");
        Enrollment en = new Enrollment();
        en.enroll(s1, c1);
        en.enroll(s2,c2);
        System.out.println(s1);
        System.out.println(s2);
        en.drop(s1);
        System.out.println(s1);
    }
}
