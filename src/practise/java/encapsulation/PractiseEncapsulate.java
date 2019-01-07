package practise.java.encapsulation;

public class PractiseEncapsulate {
	
	
	public static void main(String[] args) {
		B obj = new B();
		
		System.out.println(obj.a);
	}		
		
	}
	
	class A
	{
		int a=2000;
		int b=6556;
		
		public void add()
		{
			int c= a+b;
		}
	}
	class B extends A
		{
			int a=200;
			
			public void sum()
			
			{
				int c=a+b;
			}
		}
	


