import java.util.Scanner;

class Car{
    private String make,model;

    public Car(String make, String model) {
        this.make = make;
        this.model = model;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    @Override
    public String toString() {
        return "This Car has maker: "+make+", Model: "+model ;
    }
}


public class Q1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Car myCar1 = new Car("Mahindra","Scorpio S11");
        Car myCar2 = new Car(null,null);
        System.out.println("Initial Details");
        System.out.println(myCar1);
        System.out.println(myCar2);
        System.out.println("Enter Values for 2nd car");
        System.out.println("Enter maker name");
        String make = sc.next();
        System.out.println("Enter model name");
        String model = sc.next();
        myCar2.setMake(make);
        myCar2.setModel(model);
        System.out.println("After modifying Details");
        System.out.println(myCar1);
        System.out.println(myCar2);
    }
}
