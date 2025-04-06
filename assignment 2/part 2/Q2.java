import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

class User{
    private String name;
    private int age;

    public User(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "name='" + name +", age=" + age;
    }
}
class ageComparator implements Comparator<User> {
    @Override
    public int compare(User u1, User u2) {
        return Integer.compare(u1.getAge(), u2.getAge());
    }
}
class ArrayListUser{
    ArrayList<User> userArrayList = new ArrayList<>();
    public void addUser(User u){
        userArrayList.add(u);
    }
    public void printUser(){
        for (User u:userArrayList)
            System.out.println(u);
    }
    public void sortBYAge(){
        Collections.sort(userArrayList,new ageComparator());
        for (User u: userArrayList)
            System.out.println(u);
    }
}
public class Q2 {
    public static void main(String[] args) {
        User u1 = new User("Rabi",20);
        User u2 = new User("Pratik",21);
        User u3 = new User("Smruti",19);
        User u4 = new User("Naresh",20);

        ArrayListUser au = new ArrayListUser();
        au.addUser(u1);
        au.addUser(u2);
        au.addUser(u3);
        au.addUser(u4);
        System.out.println("Normal Print without age sorting");
        au.printUser();
        System.out.println("Print with age sorting");
        au.sortBYAge();
    }
}
