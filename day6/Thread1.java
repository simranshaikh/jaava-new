package day6;

public class Thread1 implements Runnable {

	@Override
	public void run() {
		System.out.println("hi....");

	}
public static void main(String[] args) {
	Runnable t1=new Thread1();
	Thread mt=new Thread(t1);
	mt.start();
	
}
}
