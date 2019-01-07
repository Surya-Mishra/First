package practise.java.exception.handling;

import java.util.Scanner;

public class Exception_Handling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Enter two number");
		
		int a= obj.nextInt();
		int b= obj.nextInt();
		
		try{
			int c= a/b;
			
			System.out.println(c);
		}
		catch (Exception e){
			
			System.out.println("Exception Is :-"+ e);
			throw e;
			
		}
		finally {
			System.out.println("I will defenitly RUN");
		}
		
		

	}

}
