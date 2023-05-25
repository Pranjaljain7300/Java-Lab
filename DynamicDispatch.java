abstract class Shape
{
protected final static double PI = 22.0/7.0;
protected double length;
public abstract double area();
}
class Square extends Shape
{
Square(double side)
{
length=side;
}
public double area()
{
return length*length;
} }
class Circle extends Shape
{
Circle(double radius)
{
length=radius;
}
public double area()
{
return PI*length*length;
} }
public class DynamicDispatch
{
public static void main(String[] args)
{
	System.out.println("This program is written by Pranjal Jain");
Shape sh;
Square sq = new Square(10.0);
Circle circ = new Circle(10.0);
sh=sq;
System.out.println("\n Area of Square = " + sh.area());
sh=circ;
System.out.println("Area of circle = " + sh.area());
} }