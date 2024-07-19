package Dat9;

import java.util.Scanner;

public class Assignment {

	public static void main(String[] args)
	{
      
	 Scanner sc=new Scanner(System.in);
	 System.out.println("Enter a String:");
	 
	 String str= sc.next();
	 String x = str;
	 
	 String rev="";
	 
	 int len=str.length();
	 
	 for (int i=len -1;i>=0; i--)
	 {
		 rev=rev+str.charAt(i);
		 
	 } if (x.equals(rev))
	 {
		 System.out.println(x+"Entered number is palindrom");
	 }
	 else {
		 System.out.println(x+"entered number is not palindrom");
	 }
	 
		 
	 
	 
	 
	 
	 
		
				

	}

	private static String charAt(int i) {
		// TODO Auto-generated method stub
		return null;
	}

}
