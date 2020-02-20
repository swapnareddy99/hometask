package com.epam.amazoninterest;
import java.util.Scanner;
import java.lang.*;
import com.epam.amazoninterest.simplecompound;
import com.epam.amazoninterest.amazon;
public class App 
{
	public static void main(String[] args) {
		amazon ob=new amazon();
		Scanner sc = new Scanner(System.in);
	System.out.println("Enter option");
	int op=sc.nextInt();
	switch(op) {
	case 1:ob.interest();
	break;
	case 2:ob.construction();
	break;
	}
	}
	
}
