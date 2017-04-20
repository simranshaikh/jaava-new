package day1;

public class prob3 {
	public static void main(String arr[])
	{  
		int n1=Integer.parseInt(arr[0]);
		char ch=arr[1].charAt(0);
		int n2=Integer.parseInt(arr[2]);
		
		switch(ch)
		{
		case '+':
			System.out.println("sum is"+(n1+n2));
			break;
		case '-':
			System.out.println("substraction is"+(n1-n2));
			break;
		case '/':
		
			System.out.println("division is"+(n1/n2));
			break;
		case '*':
			
			System.out.println("multiplication is"+(n1*n2));
			break;
				
				
		}
		
	}

}
