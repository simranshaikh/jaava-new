package day2;
import java.util.Scanner;
public class booktest {
public static void main(String[] args) {
	/*bookdetails book=new bookdetails();
	Scanner sc=new Scanner(System.in);
	System.out.println("enter book no");
	int bookno=sc.nextInt();
	System.out.println("enter book's title");
	String Title=sc.next();
	System.out.println("enter book's author");
	String Author=sc.next();
	System.out.println("enter book's price");
	Float price=sc.nextFloat();
	book.setBookNo(+bookno);
	book.setTitle(Title);
	book.setAuthor(Author);
	book.setPrice(price);
	book.getBookNo();
	book.getAuthor();
	book.getPrice();
	book.getTitle();
	System.out.println(book);*/
	bookdetails book1=new bookdetails(101,"inferno","dan",3550);
	bookdetails book2=new bookdetails(102,"angelsanddemon","dan",3450);
	bookdetails book3=new bookdetails(103,"adadasdasd","dan",3452);
	System.out.println(book2);
	
	bookdetails.getcount();

}



}
