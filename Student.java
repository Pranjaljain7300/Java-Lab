class Student
{
int id;
String name;
int age;
Student(int i,String n,int a)
{
id = i;
name = n;
age=a;
}
Student(Student s)
{
id = s.id;
name =s.name;
age=s.age;
}
void display()
{
System.out.println(id+" "+name+" "+age);
}
public static void main(String args[])
{
Student s1 = new Student(111,"Kalpana",39);
Student s2 = new Student(s1); //copy contents from s1 in to s2
s1.display();
s2.display();
}
}