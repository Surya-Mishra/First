package practise.java.string;

import java.util.Scanner;

public class Strings {

	public static void main(java.lang.String[] args) {
		// TODO Auto-generated method stub
		
		Scanner obj = new Scanner(System.in);
		
		System.out.println("Please Enter two name");
		
		String s1= obj.nextLine();
		String s2= obj.nextLine();
		
		System.out.println(s1);
		System.out.println(s2);
		
		
		String s3=s1.concat(s2);
		String s3upper=s3.toUpperCase();
		
		System.out.println(s3upper);
		
		System.out.println("Concatination of s1 and s2 are :-"+s3 );
		System.out.println("Length of String:-" +s3.length());
		
		

	}

}
