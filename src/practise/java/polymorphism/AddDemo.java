package practise.java.polymorphism;

public class AddDemo {
	
	public void add(int a, int b)
	{
		int c = a+b;
		System.out.println(c);
	}
	
	public void add(int a, int b, int c)
	{
		int d = a+b+c;
		System.out.println(d);
	}
	
	public static void main(String[] args) {
		
		AddDemo obj= new AddDemo();
		
		obj.add(150, 67);
		obj.add(45, 64, 67);
	}
	
	
	

}
