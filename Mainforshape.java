abstract class Shape
{
int length;
int width;
Shape(int a, int width)
{
length=a;
this.width=width;
}
abstract void area();
}
class Rectangle extends Shape
{
Rectangle(int length, int width)
{
super(length,width);
}
void area()
{
System.out.println("area of reactange is " +(length*width));
}
}
class Cuboid extends Shape
{
int height;
Cuboid(int length, int width, int height)
{
super(length,width);
this.height=height;
}
void area()
{
System.out.println("Surface area of cuboid is " +(2*length*width+2*width*height+2*height*length));
}
void volume()
{
System.out.println("volume of cuboid is"+(length*width*height));
}
}
class Mainforshape
{
public static void main(String args[])
{
	System.out.println("This program is written by Pranjal jain");
Rectangle r=new Rectangle(10,20);
r.area();
Cuboid c=new Cuboid(5,10,15);
c.area();
c.volume();
Shape s;
s=r;
s.area();
s=c;
s.area();
}}