package test;

import java.util.ArrayList;

public class arryapractice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList obj= new ArrayList();
		obj.add("ramita");
		obj.add("luky");
		System.out.println(obj.toString());
		
		obj.add(1, 10);
		System.out.println(obj.toString());
		System.out.println(obj.contains("ramita"));
		obj.add("ramita");
		System.out.println(obj.toString());
		System.out.println(obj.get(0));
		System.out.println(obj.size());
		obj.swap

	}

}
