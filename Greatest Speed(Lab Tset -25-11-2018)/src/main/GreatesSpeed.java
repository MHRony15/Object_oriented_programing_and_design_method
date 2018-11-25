package main;

import java.util.Scanner;

public class GreatesSpeed {
	static final int MAXTENSION = 60;
	static final int LENGTH = 3;
	static final double EPS = 10E-10;
	private static double mass;
	
	public double tension(double speed,double mass) {
		
		return (mass*speed*speed)/LENGTH;
	}
	public int  maxSpeed(double mass) {
		int result = 1;
		int speed[] = {1,10,20,40};
		for(int i = 0; i < 4; i++) {
			if(tension(speed[i],mass)<MAXTENSION) {
				result = speed[i];
			}
		}
		return result;
		
	}
		

}
