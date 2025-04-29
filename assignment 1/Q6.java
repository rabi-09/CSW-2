class College{
    private String collegeName, collegeLoc;
    public College(String collegeName, String collegeLoc) {
        this.collegeName = collegeName;
        this.collegeLoc = collegeLoc;
    }

    public String getCollegeName() {
        return collegeName;
    }

    public void setCollegeName(String collegeName) {
        this.collegeName = collegeName;
    }

    public String getCollegeLoc() {
        return collegeLoc;
    }

    public void setCollegeLoc(String collegeLoc) {
        this.collegeLoc = collegeLoc;
    }
    public void dispayCollegeInfo(){
        System.out.println("College Details:");
        System.out.println("College name: "+collegeName+" College location: "+collegeLoc);
    }
}
class Student{
    private int studentID;
    private String studentname;
    College college;

    public Student(int studentID, String studentname, College clg) {
        this.studentID = studentID;
        this.studentname = studentname;
        this.college = clg;
    }

    public int getStudentID() {
        return studentID;
    }

    public void setStudentID(int studentID) {
        this.studentID = studentID;
    }

    public String getStudentname() {
        return studentname;
    }

    public void setStudentname(String studentname) {
        this.studentname = studentname;
    }

    public College getCollege() {
        return college;
    }

    public void setCollege(College college) {
        this.college = college;
    }
    public void displayStudentInfo(){
        System.out.println("Student Details:");
        System.out.println("studentID :"+studentID+" Student Name: "+studentname+" College name: "+college.getCollegeName());
    }
}
public class Q6 {
    public static void main(String[] args) {
        College c1 = new College("ITER", "BBSR");
        College c2 = new College("NITK", "HR");
        Student s1  = new Student(1, "Rabi",c1);
        Student s2  = new Student(2, "Pratik",c1);
        Student s3  = new Student(3, "Satya",c2);


        c1.dispayCollegeInfo();
        c2.dispayCollegeInfo();
        System.out.println();
        s1.displayStudentInfo();
        s2.displayStudentInfo();
        s3.displayStudentInfo();
    }
}
