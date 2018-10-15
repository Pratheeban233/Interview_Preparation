package basics;

import java.util.Scanner;

public class largestAmongNdigit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the n numbers");
		
		int n=sc.nextInt();

		int a[]=new int[n];
		 System.out.println("enter the values");
		 
		 for(int i=0;i<n;i++)
		 {
			 a[i]=sc.nextInt();
		 }
		 
		int max=maximum(a,n);
		System.out.println("largest Number"+ max);
	}
	
	static int maximum(int a[],int n)
	{
		int i,m=0;
		
		for(i=0;i<n;i++)
		{
			
			if(a[i]>m)
			{
				m=a[i];
			}
		}
		return m;
	}
}
