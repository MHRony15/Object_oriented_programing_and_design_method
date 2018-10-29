package main;

import java.util.Scanner;

/**
 * <h1>This is a Basic Calculator<h1>
 * The Calculator program implements an application that simply
 * add two number
 * substracte two integer
 * multiply two integer
 * divided two integer
 * and print it on display
 * 
 * @author Dell
 * @version 1.0
 * @since 29.10.2018
 *
 */

public class Calculator {
	/**
	 * This method  add  two integer and print it
	 * @param numA This is an integer number which will be added
	 * @param numB	This is an integer number which will be added
	 * @return result This return an integer the sum of two integer
	 */
	public static int add(int numA, int numB)
    {
        int result = numA + numB;
        return result;
    }
	/**
	 * This method substracte two integer 
	 * @param numB	This is an integer number which will be sub
	 * @param numA	This is an integer number which will be sub
	 * @return result This return an integer the substac of two integer
	 */
	public static int sub(int numA, int numB)
    {
        int result = numA-numB;
        return result;
    }
	/**
	 * This method multiply two integer
	 * @param numA This is an integer number which will be multiply
	 * @param numB mThis is an integer number which will be multiply
	 * @return result This return an integer the multiply of two integer
	 */
	
    public static int mult(int numA, int numB)
    {
        int result = numA*numB;
        return result;
    }
    /**
     * 
     * @param numA This is an integer number which will be divided
     * @param numB This is an integer number which will be divided
     * @return result This return an integer the multiply of two integer
     */
    public static int div(int numA, int numB)
    {
        int result = numA/numB;
        return result;
    }
    
	
	
	/**
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		System.out.println("Enter first and second number:");
        Scanner inp= new Scanner(System.in);
        int numA,numB;
        numA = inp.nextInt();
        numB = inp.nextInt();
        int ans;
        System.out.println("Enter your selection: 1 for Addition, 2 for substraction 3 for Multiplication and 4 for division:");
        int choose;
        choose = inp.nextInt();
        /**
         * This is 
         * 
         */
        switch (choose){
        case 1:
            System.out.println(add( numA,numB));
            break;
        case 2:
            System.out.println(sub( numA,numB));
            break;      
        case 3:
            System.out.println(mult( numA,numB));
            break;
        case 4:
            System.out.println(div( numA,numB));
            break;
            default:
                System.out.println("Illigal Operation");


        }
		

	}

}
