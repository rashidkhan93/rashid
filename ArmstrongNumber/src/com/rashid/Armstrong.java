package com.rashid;

import java.util.Scanner;

public class Armstrong {

	public static void main(String[] args) {
      int n, sum=0,temp ,r;
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter a Number");
      n = sc.nextInt();
      temp = n;
      while(temp!=0)
      {
    	  r = temp%10;
    	  sum = sum +r*r*r;
    	  temp = temp/10;
      }
      if(n==sum)
    	  System.out.println("Number is Armstrong Number");
      else
    	  System.out.println("Entered Number is not Armstrong Number");

	}

}
