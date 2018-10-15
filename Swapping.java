package basics;

import java.util.Scanner;

public class Swapping {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("Enter the numbers");
		
		int a=sc.nextInt();
		int b=sc.nextInt();
		int temp;
		
		System.out.println("before swap::   "+a+"   "+b);
	
		// with 3rd variable
		/*temp=a;
		a=b;
		b=temp;*/
		
		
		// without 3rd variable
		a=a+b;
		b=a-b;
		a=a-b;
		
		
		System.out.println("after swap::   "+a+"   "+b);
		
	}

}
