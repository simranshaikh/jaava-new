package day2;

public class customer {
	private int custid;
	private String custname;
	private String  custmobile;
	private static int count;
	public customer() {
		super();
		// TODO Auto-generated constructor stub
	System.out.println("in default constructor");
	count++;
	}
	
	public customer(int custid, String custname, String custmobile) {
		super();
		this.custid = custid;
		this.custname = custname;
		this.custmobile = custmobile;
	count++;
	}
	

public static void showcount()
{
System.out.println("no of objects created are"+"  "+count);	
}
}
