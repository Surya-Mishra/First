package practise.java.encapsulation;

public class Final {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Encapsulation_Demo obj= new Encapsulation_Demo();
		
		
		obj.getEmpname("Surya");
		obj.getEmpsal(50000);
		
		
		
		int a=obj.empsal();
		
	    String b=obj.empname();
	    
	    
	    System.out.println(a);
	    System.out.println(b);

	}

}
