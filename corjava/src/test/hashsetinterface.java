package test;

import java.util.HashSet;
import java.util.Iterator;

public class hashsetinterface {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet obj=new HashSet();
		obj.add("india");
		obj.add("u.k");
		obj.add("india");
		//System.out.println(obj);
System.out.println(obj.contains("u.K"));
obj.
Iterator<String> i=obj.iterator();
while (i.hasNext())
{
	System.out.println(i.next()); 
}
	}

}
