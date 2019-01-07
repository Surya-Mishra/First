package practise.java.encapsulation;

public class Encapsulation_Demo {
	
	
	private String empname;
	private int empsal;
	
	
	
	public int empsal()
	{
		return empsal;
	}
	
	public String empname()
	{
		return empname;
	}
	
	public String getEmpname(String name){
		return empname = name;
		
	}
	
	public int getEmpsal(int sal) {
		return empsal = sal;
		}
	
	
	
	

}


