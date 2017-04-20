package day3;

import java.util.Date;
import java.util.Scanner;

public class Tablet extends medicine {
Scanner sc=new Scanner(System.in);
String name;

	




	@Override
	public void DisplayLabel() {
		System.out.println(this.name);
		System.out.println(this.getPrice());
		System.out.println(this.getExpdate());
		
	}

}
