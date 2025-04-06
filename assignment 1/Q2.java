class Rectangle{
    private int length, width;

    public Rectangle(int length, int width) {
        this.length = length;
        this.width = width;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public double area(){
        return length*width;
    }
    public double perimeter(){
        return 2*(length+width);
    }
}

public class Q2 {
    public static void main(String[] args) {
        Rectangle rectangle = new Rectangle(5,10);
        System.out.println("Area of the rectangle is: "+rectangle.area()+" Perimeter is: "+rectangle.perimeter());
    }
}
