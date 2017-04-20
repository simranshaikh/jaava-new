package day1;

public class Demo1 {
   //'a' is reference to an array of string type 
	public static void main(String []args)
    {     
    	int i=10;
    	System.out.println("i is"+i);
    	char ch='A';
    	System.out.println("ch is"+ch);
    	float fval=1.2f;
    	System.out.println("fval is"+fval);
    	double dval=2.3;
    	System.out.println("dval is"+dval);
    	boolean bval=true;
    	System.out.println("bval is"+bval);
    	//predefined class-string
    	String name="raj";
    	System.out.println(name);
    	int num1=5,num2=4,sum;
    	sum=num1+num2;
    	System.out.println("Ans of addition of "+num1+" and "+num2+" is "+sum);
    	int arr[]=new int[5];
    	arr[0]=1; arr[1]=2; arr[2]=55; arr[3]=66; arr[4]=111;
    	System.out.println("Number of elements:"+arr.length);
    	
    	for(int j =0;j< arr.length; j++){
    		System.out.println(arr[j]);	
    	}
    	
    //args[0]="10";
    //args[1]="10";
    int n1=Integer.parseInt(args[0]);
    int n2=Integer.parseInt(args[1]);
    int sum1=n1+n2;
    System.out.println("Sum is "+sum1);
    System.out.println("Number of args passed "+args.length);
    }
	
}

