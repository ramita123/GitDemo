package test;

interface demo
{		
	static void m1()
	{
		System.out.println("creatinbg jgfkhs");
	}
	
	default void test()
	{
		System.out.println("stetenm");
	}
	
}	

	interface demo2
	{	
		static void m1()
		{
		System.out.println("testingg creayuugmn");
		
		}
		
		default void test()
		{
			System.out.println("treyingg");
		}
		
	}
	

public class inheritance2 implements demo,demo2 {
	
	
	  public void test()
	  { demo.super.test(); 
	  
	  demo2.super.test(); 
	  }
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritance2 obj=new inheritance2();
		obj.test();
		demo.m1();
		demo2.m1();
		
	}

}
