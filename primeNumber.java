package basics;

import java.util.Scanner;

public class primeNumber {

	public static void main(String[] args) {
		
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the Number:::");
		
		int n=sc.nextInt();
		
		int count=0;
		for(int i=1;i<=n;i++)
		{
			{
				if(n%i==0)
				{
					count++;
				}
			}
		}
		
		if(count==2)
		{
			System.out.println("its prime numbber");
		}
		else
		{
			System.out.println("its NOT prime Number");
		}

	}}
