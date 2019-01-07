package practise.java.polymorphism;

import java.util.Scanner;

public class MultiplicationTable {
	
	public void table(int i,int a)
	{
		//Scanner s = new Scanner(System.in);
		//System.out.println("Enter Number");
		//int n = s.nextInt();
		for (i=1;i<=10;i++)
		{
			System.out.println(i*a);
		}

	}
	
	public void table1(int j, int k, int l){
		for (j=1;j<=10;j++)
			
		{
			System.out.println(j*k);
			
			System.out.println(j*l);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MultiplicationTable obj= new MultiplicationTable();
		obj.table(1, 5);
		obj.table1(1, 2, 3);
	}

}
