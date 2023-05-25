class Rectangle
{
int length;
int width;
int area()
{
return length*width;
}
void perimeter()
{
int p=2*length+2*width;
System.out.println("perimeter of rectangle is " +p);
}
Rectangle()
{
length=10;
width=10;
}
Rectangle(int a)
{
length=width=a;
}
Rectangle(int a, int b)
{
length=a;
width=b;
}
}
class MainForRectangle
{
 public static void main(String[] args)
{
    System.out.println("This program is written by Pranjal Jain");
Rectangle r1= new Rectangle();
r1.length=5;
r1.width=5;
Rectangle r2=new Rectangle(10);
Rectangle r3=new Rectangle(20,10);
System.out.println(" ");
r1.perimeter();
r2.perimeter();
r3.perimeter();
float area1= r1.area();
float area2=r2.area();
System.out.println(" ");
System.out.println("area of Rectangle 1 and 2 are " +area1+", " +area2);
System.out.println("area of Rectangle objcet3 is" +r3.area());
}
}