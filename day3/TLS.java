package day3;

import java.util.Scanner;

public class TLS {

	public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);	 
//base class reference which is pointing to derived class object is called upcasting
	person t= new trainer(sc.next(),sc.next(),sc.next(),sc.nextInt(),sc.nextInt());
	t.showdetails();
	trainer p=(trainer) t;
	p.trainerkamethod();
	}

}
