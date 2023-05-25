class Super
{
static final int a=20;
static int b;
int c=100;
}
class SuperDemo extends Super
{
void display()
{
System.out.println("\nFinal Variable=" +super.a);
System.out.println("Super class Variable=" +super.c);
System.out.println("Static Variable="+b);
}
public static void main(String[] args)
{
	System.out.println("This program is written by Pranjal Jain");
SuperDemo s=new SuperDemo();
s.display();
} }