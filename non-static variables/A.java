class A 
{
	int i=10;
	double d=1.5;
	
	public static void main(String[] args) 
	{
		A a1 = new A();
		System.out.println(a1.i);
		System.out.println(a1.d);
		a1.i = 20;
		a1.d = 5.7;
		System.out.println(a1.i);
		System.out.println(a1.d);
	}
}
