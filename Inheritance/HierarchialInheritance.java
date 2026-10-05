class A
{
	void m1() {
		System.out.println("m1() from A class");	
	}
}

class B extends A
{
	void m2() {
		System.out.println("m2() from B class");
	}
}

class C extends A
{
	void m3() {
		System.out.println("m3() from C class");	
	}
}

class HierarchialInheritance 
{
	public static void main(String[] args) 
	{
		B b1 = new B();
		b1.m1(); // m1() from A class 
		b1.m2(); // m2() from B class 
		// b1.m3(); // CTE
		System.out.println("----------------------");
		C c1 = new C();
		c1.m1(); // m1() from A class 
		// c1.m2(); // CTE
		c1.m3(); // m2() from B class 
	}
}
