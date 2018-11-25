package main;

import java.util.Scanner;

public class TricketSeller {
	static final int MAX_SELL_PER_PERSON = 4;
	public static  int TOTAL =100;
	public static int Sell;
	public static int Count=0;
	
		public int BuyTicket(int TOTAL) {
			Scanner in = new Scanner(System.in);
			while(TOTAL>0) {
				System.out.print("Enter The Number Of Tickets:");
				Sell =in.nextInt();
				if(Sell>MAX_SELL_PER_PERSON) {
					System.out.println("Invalid !!!");
				}
				else {
					TOTAL=TOTAL-Sell;
					System.out.println("Remaining Tickets :"+TOTAL);
					Count++;
				}
				System.out.print("Total Number of Buyers:"+Count);
				
			
			
			}
			return TOTAL;
		}
		
	
	

}
