package day1;

import java.util.Scanner;

public class Testemp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//emp e1=new emp("shashank",101,50000);
		
	//System.out.println(e1);
	/*emp e2=new emp();
	e2.setEmpid(201);
	e2.setName("shashank");
	e2.setSalary(2000);
	System.out.println(e2);
	}*/
 Scanner sc=new Scanner(System.in);
	System.out.println("how many employees are there:");
	int num_of_emp=sc.nextInt();
	emp earr[]=new emp[num_of_emp];
	//
	for (int i=0;i<earr.length;i++)
	{   earr[i]=new emp();
		System.out.println("enter empid no");
		int no=sc.nextInt();
		earr[i].setEmpid(no);
		System.out.println("enter name");
		String j=sc.next();
		earr[i].setName(j);
		System.out.println("enter salary");
		int sal=sc.nextInt();
		earr[i].setSalary(sal);
     }
	for (int i=0;i<earr.length;i++){
		System.out.println(earr[i]);
	}
	
	}
}
