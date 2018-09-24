package main;

import java.util.Date;

public class GreetingRunnable implements Runnable{
	
	private static final int REPETITION =10;
	private static final int DELAY =1000;
	
	private String greeting;
	
	public GreetingRunnable(String aGreeting) {
		greeting = aGreeting;
	}
	@Override
	public void run() {
		try {
			for(int i = 1; i <= REPETITION;i++){
				Date now = new Date();
				System.out.println(now +" "+ greeting);
				Thread.sleep(DELAY);
				
			}
		}
		catch(InterruptedException exception){
			
		}
		finally {
			
		}
		
		
	}

}
