package practise.java.collection;

import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList obj= new ArrayList();
		
		obj.add("Surya");
		obj.add(2.5);
		obj.addAll(2,obj);
		System.out.println(obj);
		obj.removeAll(obj);
		System.out.println(obj);
		

	}

}
