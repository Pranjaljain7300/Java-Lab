class ExcHandling
{
public static void main(String ar[])
{
	System.out.println("This program is written by Pranjal Jain");
int a[]={5,10};
int b=5;
try
{
int x=a[2]/(b-a[0]);
}
catch(ArithmeticException e)
{
System.out.println("div by zero");
}
catch(ArrayIndexOutOfBoundsException e)
{
System.out.println("Array out of bound Error");
}
int y=a[1]/a[0];
System.out.println("y value is " +y);
}
}