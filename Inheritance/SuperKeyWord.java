class A
{
	int i = 10;
	void m1() {
		System.out.println("m1() of A class");	
	}
}

class B extends A
{
	int i = 20;
	void m1() {
		System.out.println(i);
		System.out.println(super.i);
		super.m1();
		System.out.println("m1() of B class");
	}
}

class SuperKeyWord 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.m1();
	}
}
