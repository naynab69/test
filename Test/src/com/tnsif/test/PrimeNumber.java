package com.tnsif.test;

public class PrimeNumber {
	public static void main(String[] args) {

	    int num = 31;
	    
	    boolean flag = false;
	    
	    for (int i = 2; i <= num / 2; ++i) {
	      // condition for nonprime number
	      if (num % i == 0) {
	        flag = true;
	        break;
	      }
	    }

	    if (flag)
	      System.out.println(num + " is a not a prime number.");
	    else
	      System.out.println(num + " is prime number.");
	  }

}
