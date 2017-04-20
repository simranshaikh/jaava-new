package day6;

public class Mythread1 extends Thread {
public Mythread1(String tnm) {
	this.setName("t1");
}
	@Override
	public void run() {
		System.out.println("hello world");
	}
	
public static void main(String[] args) {
	Mythread1 m=new Mythread1("tname");
	m.start();
}
}
