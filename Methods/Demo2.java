class Demo2 
{
	public static void m1() {
		System.out.println("m1() - executed");
	}
	public static void main(String[] args) 
	{
		System.out.println("Main executed");
		m1();
		m2(10);
		m2(5+7);
		// m3(6.5, 9); // C.T.E.
		m3(9, 6.5);
	}
	public static void m2(int i)
	{
		System.out.println("m2(int i)-Executed " + i);		
	}
	public static void m3(int i, double d) 
	{
		System.out.println("m3(int i, double d)-Executed " + i + " , " + d);
	}
}