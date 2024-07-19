package Day18;

import java.util.Scanner;

public class ExceptionHandlings {

	public static void main(String[] args)
	{
	
		System.out.println("Program is started");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int num=sc.nextInt();
		
		try
		{
			System.out.println(100%num);
			
			
		}
		catch (ArithmeticException e)
		{
			System.out.println("Handled Exception");
			System.out.println(e.getMessage());
			
		}
		catch (NullPointerException e)
		{
			System.out.println("Handled Exception");
			System.out.println(e.getMessage());
		}
		
	    catch(NumberFormatException e)
		{
			System.out.println("Invalid Data");
			System.out.println(e.getMessage());
			
			
		}
		finally
		{
			System.out.println("Entered finally block");
		
			
		}
		System.out.println("Program is exicuted");
		System.out.println("Program is completed");
		
		
		
	}

}
