package com.epam.amazoninterest;
import java.util.Scanner;
public class amazon extends simplecompound {
	void construction() {
	int cost,totalarea,ch;
	Scanner sc = new Scanner(System.in);
	System.out.println("How many squarefeets do you want?");
	totalarea=sc.nextInt();
	System.out.println( "Choose the standard of the material");
	ch=sc.nextInt();
	switch(ch)
	{
	case 1:
		System.out.println( "1200INR per sq.feet for standard material");
		cost=totalarea*1200;
		System.out.println( "Construction cost is Rs."+cost);
		break;
	case 2:
		System.out.println( "1500INR per sq.feet for above standard material");
		cost=totalarea*1500;
		System.out.println( "Construction cost is Rs."+cost);
		break;
	case 3:
		System.out.println( "1800INR per sq.feet for high standard material");
		cost=totalarea*1800;
		System.out.println( "Construction cost is Rs."+cost);
		break;
	case 4:
		System.out.println( "2500INR per sq.feet for high standard material and fully automated home");
		cost=totalarea*2500;
		System.out.println( "Construction cost is Rs."+cost);
		break;
	default:System.out.println("choose the correct material");
	}
 }

}
