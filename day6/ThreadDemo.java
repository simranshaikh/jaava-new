package day6;

public class ThreadDemo {

	public static void main(String[] args) {
		Runnable t=new Mythread();
		Thread m=new Thread(t);
	m.start();
	}

}
`