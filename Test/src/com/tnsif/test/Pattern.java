package com.tnsif.test;

public class Pattern {
	 public static void main(String[] args) {
		  
	     for(int i=1;i<7;i++)
	     {
	       for(int s=7-i;s>1;s--)
	       {
	         System.out.print(" ");
	       }
	   
	       for(int j=i;1<=j;j--)
	       {
	         System.out.print(j);
	       }

	       for(int k=2;k<=i;k++)
	       {
	         System.out.print(k);
	       }

	       System.out.println();
	     }
	 }


}
