package practise.java.other;

public class Method {
	
	public int add(int a,int b){
		int c= a+b;
		return c;
	}
	
	public static void main(String[] args) {
		
		Method obj= new Method();
		
		
		int z= obj.add(23,76);
		
		System.out.println(z);
	}

}