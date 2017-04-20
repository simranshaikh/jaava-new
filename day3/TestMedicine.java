package day3;

import java.util.Date;
import java.util.Random;
import java.util.Scanner;

public class TestMedicine {
	static Scanner sc=new Scanner(System.in);
	public static void main(String[] args) {
		medicine m[]= new medicine[5];
		for (int j=0;j<4;j++)
		{
			Random rand = new Random();
			int  n = rand.nextInt(3) + 1;	
		switch(n)
		{
		
		case(1):
	
			 m[j]=new Tablet();
			
		break;
		case(2):
	
			m[j]=new Syrup();
			
		case(3):
			
			 m[j]=new Ointment();
			break;
		}
			
	}
		
		
	
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		

	}

}
