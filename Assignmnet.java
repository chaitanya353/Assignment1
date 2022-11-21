/*
 * Assignment 1 - Near Miss
 * File Holding the Program: Assignment1
 * 
 * Programmers Names: 
 * 1. Chaitanya Meda(ChaitanyaMeda@lewisu.edu)
 * 2. Anuradha Gude (anuradhagude@lewisu.edu)
 * 
 * Course: FA22-CPSC-60500-003
 * 
 * November 20, 2022
 * 
 * Explanation: first and foremost, the upper and lower limit of k are defined, and then the x and y values are generated according to the k value according to the limit range that was set. 
 * The value of n will be generated at random within the range of 2<n<12 inclusive. Then, in accordance with the procedure for locating the near miss, we carried out the procedure by solving the equation and determining the value of the near miss, and finally, we found the nearest miss's value.
 * 
 */
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;
public class Assignmnet {
	
	//Main() Function

	public static void main(String[] args) 
	{ 
		int x=0;
	    int y = 0;
	    int z = 0;
	    
	    int lowerlimit = 10; 
	    
	    Scanner userinput = new Scanner(System.in);
	    
	    System.out.print("Enter Upper limit for K:: ");
	    int upperlimit = userinput.nextInt();
	    
	    System.out.print("Enter value for n  it must be greater than 2:: ");
	    int n = userinput.nextInt();
	    while(n<2)
	    {
	    	System.out.print("Enter value for n  it must be greater than 2:: ");
	    	n = userinput.nextInt();
	    }
	    

	    
	    double smallest_miss = 99999999.99; 
	    
	    //for loop will execute 6 times, and will compute the near miss 6 times
	    for (int i =0; i<6; i++) 
	    {
	        	
	        	x =  (int) ((Math.random() * (upperlimit - lowerlimit)) + lowerlimit);
	        	y =  (int) ((Math.random() * (upperlimit - lowerlimit)) + lowerlimit);
	        	n =  (int) ((Math.random() * (11 - 3)) + 3);
	        	
	        	System.out.print("--------------------------");
	        	System.out.print("Value of x is:: " + x+"\n");
	        	System.out.print("Value of y is:: " + y+"\n");
	        	System.out.print("Value of n is:: " + n+"\n");
	        	System.out.print("--------------------------");
	        	
	        //x^n + y^n
	        int sum_xn_yn = (int)((Math.pow (x, n))+(Math.pow (y, n)));
	        
	        //For fermat's equation, we take nth root.
	        z = (int) Math.pow (sum_xn_yn, 1.0/n);
	        
	        //Subtract z power n from x^n + y^n to get the near miss value.
	        int near_miss = (int)(sum_xn_yn - Math.pow (z, n));
	        
	        System.out.print("--------------------------");
	        //By following the guidelines, here we find the relative miss.
	        double relative_miss = 100. * near_miss / sum_xn_yn;
	        System.out.println("\n\nNear Miss is:: "+near_miss+" \nRelative Miss is:: "+relative_miss);
	        
	        
	        //Compare relative miss with smallest miss to determine the smallest miss.
	        if(relative_miss<smallest_miss)
	        {
	        	smallest_miss=relative_miss;
	        }
	        System.out.println("Smallest Possible Miss is:: \n"+smallest_miss);
	        System.out.print("--------------------------");   
	    }
	}
}



