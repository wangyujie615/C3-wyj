import java.util.Scanner;

class Circle{
    private double radius;
    public Circle(){}
    public Circle(double radius)
    {
        this.radius=radius;
    }
    public double getArea(){
        return Math.PI*Math.pow(this.radius,2);
    }
    public double getPerimeter()
    {
        return 2*Math.PI*this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }
}
public class Task5 {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        System.out.println("请输入圆的半径：");
        double radius=in.nextDouble();
        Circle c=new Circle(radius);
        System.out.printf("the area is %.2f\n",c.getArea());
        System.out.printf("the area is %.2f\n",c.getPerimeter());

    }

}
