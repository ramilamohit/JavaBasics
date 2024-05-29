package InterviewPreperation;

public class StaticTest 
{
	static int a;
	int b;
	static int x;
	static {
		 x = 100;
	}

	public static class division
	{
		public static void divisiontest()
		{
			System.out.println(a);
			StaticTest s = new StaticTest();
			s.b =8;
			System.out.println(s.b);
			System.out.println("Division from static clas");
		}
	}

	
	static void add()
	{
		System.out.println("add");
	}
	static void multiply()
	{
		System.out.println("Multiply");
	}
	
	public void substract()
	{
		System.out.println("Substract");
		multiply();
	}
	
	static
	{
		System.out.println("This is from static method");
	}
	public void check()
	{
	System.out.println("called by non-static method");	
	}
	void check1()
	{
	check();
	}
	public static void main(String[] args) {
		
		System.out.println(x);
		a =10;
		add();
				
		StaticTest st = new StaticTest();
		st.substract();

		st.b= 5;
		
		division dv = new division();
		dv.divisiontest();
		st.check1();
	}
	
}
