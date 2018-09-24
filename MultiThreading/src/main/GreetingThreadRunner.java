package main;

public class GreetingThreadRunner {
	public static void main(String[] arg) {
		GreetingRunnable r1 =new GreetingRunnable("Hello");
		GreetingRunnable r2 =new GreetingRunnable("Mahady");
		Thread t1 = new Thread(r1);
		Thread t2 = new Thread(r2);
		t1.start();
		t2.start();
		
	}

}
