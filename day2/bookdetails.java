package day2;

public class bookdetails 
{
	private int bookNo;
	private String title;
	private String author;
	private float price;
	private static int count;

	public bookdetails() {
		super();
		// TODO Auto-generated constructor stub
	}

	public  static int getcount()
	{
	System.out.println("no of objects created are"+count);
	return count;
	}
	
	public int getBookNo() {

		return bookNo;
	}


	public void setBookNo(int bookNo) {
		this.bookNo = bookNo;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) 
	{
		int i=title.length();
		if (i<4)
		{
			System.out.println("title length is less than 4");

		}
		else{
			this.title = title;
		}


	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public float getPrice() {

		return price;
	}
	public void setPrice(float price) {
		if (0.0f<price && 5000.0f>price)
		{
			this.price = price;
		}
		else
		{
			System.out.println("price is out of range");
		}
	}

public bookdetails(int bookNo, String title, String author, float price){
	super();
count++;
	this.bookNo = bookNo;
	int k=title.length();
	if (k<4)
	{
		System.out.println("title length is less than 4");
	}
	else
	{
		this.title = title;
	}
	this.author = author;
	if (0.0f<price && 5000.0f>price)
	{
		this.price = price;
	}
	else
	{
		System.out.println("price is out of range");
	}
}

public String toString() 
   {
	return "Bookno =" + bookNo + "\n Title="  +title+  "\n Author is" + author
			+ "\n price is"+price;
   
   }

}