class Car implements Comparable<Car>{
    String model, color;
    int speed;
    Car(String model, String color, int speed){
        this.model=model;
        this.color=color;
        this.speed=speed;
    }
    @Override
    public String toString(){
        return "Car Model: "+model+" Color: "+color+" Speed: "+speed;
    }
    @Override
    public int compareTo(Car car) {
        return Integer.compare(speed,car.speed);
    }
}
public class Q3 {
    public static void main(String[] args) {
        Car c1 = new Car("Scorpio S11", "White", 200);
        Car c2 = new Car("Cullinan", "Dark Blue", 250);
        if(c1.compareTo(c2)==1)
            System.out.println(c1);
        else
            System.out.println(c2);
    }
}
