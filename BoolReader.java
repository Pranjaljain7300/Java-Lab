1) // Save below file Book.java
package packagetest;
public class Book
{
int book_no,book_id,book_pages;
public Book(int a,int b, int c)
{
book_no=a;
book_id=b;
book_pages=c;
}
public void book_info()
{
System.out.println("The Book No"+book_no);
System.out.println("The Book Id "+book_id);
System.out.println("The Book Pages"+book_pages);
}
}
2. //Save below file BookMain.java
import packagetest.Book;
class BookReader
{
public static void main(String[] args)
{
Book b=new Book(12,15,86);
b.book_info();
}
}