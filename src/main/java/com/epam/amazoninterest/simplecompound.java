package com.epam.amazoninterest;
import java.util.Scanner;
public class simplecompound {
	void interest() {
	double pr,rate,time,si,ci;
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the amount : ");
	pr=sc.nextDouble();
	System.out.println("Enter the no. of years:");
	time=sc.nextDouble();
	System.out.println("Enter the rate of interest :");
	rate=sc.nextDouble();
	si=(pr*rate*time)/100;
	ci=pr*Math.pow(1.0+rate/100.0,time)-pr;
	System.out.println("Simple Interest is : "+si);
	System.out.println("Compound Interest is : "+ci);
	}
}