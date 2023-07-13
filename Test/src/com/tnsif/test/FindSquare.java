package com.tnsif.test;

public class FindSquare {

	  public static double findSqrt(double x)
	  {
	    // for 0 and 1, the square roots are themselves
	    if (x < 2)
	      return x;
	 
	    // considering the equation values
	    double y = x;
	    double z = (y + (x / y)) / 2;
	 
	    // as we want to get upto 5 decimal digits, the
	    // absolute difference should not exceed 0.00001
	    while (Math.abs(y - z) >= 0.00001) {
	      y = z;
	      z = (y + (x / y)) / 2;
	    }
	    return z;
	  }
	 
	  public static void main(String[] args)
	  {
	    double n = 4;
	 
	    double ans = findSqrt(n);
	 
	    System.out.println(String.format("%.5f", ans)
	                       + " is the square root of 3");
	  }
}
