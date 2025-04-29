class Point{
    private double x, y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }
    public Point(Point op){
        this.x = op.x;
        this.y = op.y;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    @Override
    public String toString() {
        return "Point ("+ x+" , " +y+")";
    }
}
public class Q3 {
    public static void main(String[] args) {
        Point p1 = new Point(2,5);
        Point p2 = new Point(p1);
        p2.setX(3.5);
        p2.setY(6.5);
        System.out.println(p1);
        System.out.println(p2);
    }
}
