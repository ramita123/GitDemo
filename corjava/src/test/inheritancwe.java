package test;

  public class inheritancwe implements test1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		inheritancwe obj=new inheritancwe();
		obj.add();
		obj.add2();

	}

	@Override
	public void add() {
		// TODO Auto-generated method stub
		System.out.println("testing interface");
		
		System.out.println(y);
	}

	@Override
	public void add2() {
		// TODO Auto-generated method stub
		System.out.println("testing done");
	}
}
	
	
	
	interface test1
	{
		void add();
		void add2();
		int y=12;
		static void m1()
		{
			System.out.println("try done");
		}
	}
	interface test2
	{
		 default void m2()
		{
			
		}
	}
	
	


