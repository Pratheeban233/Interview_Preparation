package basics;

import java.util.Scanner;

public class palindrome {

	public static void main(String[] args) {
			String a,b;
			StringBuffer sb;
		Scanner sc= new Scanner(System.in);
		
		System.out.println("Enter the word");
		
		 a=sc.nextLine();
		 sb=new StringBuffer(a);
		 b=sb.reverse().toString();
		 
		 if(a.equals(b))
		 {
			 System.out.println("palindrome");
		 }
		 else
		 {
			 System.out.println("Not palindrome");
		 }
		
	}

}
