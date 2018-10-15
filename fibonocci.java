package basics;

import java.util.Scanner;

public class fibonocci {

	public static void main(String[] args) {
		
	Scanner sc=new Scanner(System.in);
	
	System.out.println("Enter n number");
	
	int n=sc.nextInt();
	
	int a=0;
	int b=1;
	int c,count=0;
	
	while(true)
	{
		c=a+b;
	
		if(c>=n)
		{
			break;
		}
	
	a=b;
	b=c;
	 System.out.println(c);
	}
	}
}
