interface vehicle{
     abstract void accelerate();
     abstract void brake();
}
class Car1 implements vehicle{
    public void accelerate(){
        System.out.println("car is accelerating");
    }
    public void brake(){
        System.out.println("car is braking");
    }
    public void accelerate(float speed){
        System.out.println("car is accelerating with speed: "+speed);

    }
    public void accelerate(int duration){
        System.out.println("car is accelerating for duration: "+duration);
    }
}class Bicycle implements vehicle{
    public void accelerate(){
        System.out.println("Bicycle is accelerating");
    }
    public void brake(){
        System.out.println("Bicycle is braking");
    }
    public void accelerate(float speed){
        System.out.println("Bicycle is accelerating with speed: "+speed);

    }
    public void accelerate(int duration){
        System.out.println("Bicycle is accelerating for duration: "+duration);
    }
}
public class Q9 {
    public static void main(String[] args) {
        Car1 c = new Car1();
        c.accelerate();
        c.accelerate(50f);
        c.accelerate(60);
        c.brake();
        Bicycle b = new Bicycle();
        b.accelerate();
        b.accelerate(10f);
        b.accelerate(30);
        b.brake();
    }
}
