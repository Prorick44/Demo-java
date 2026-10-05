// int i = 10; can not declare outside a class (encapsulation will not support this) // global variables // not suppoeted in java
class A 
{
	int j = 15; // instance variable or non static variable
	static int k = 35; // static variable or class variable
	public static void main(String[] args) 
	{
		int l = 25; // local variable
		System.out.println(l);
		m1();
		System.out.println(l);
		m2();
		System.out.println(l);
	}
	
	public static void m1()
	{
		int l = 50;
		System.out.println(l);
	}
	public static void m2() 
	{
		// System.out.println(l); will throw an error as ther is no local variable named l
	}
}

/*
	3 types of variables in java:- 
		1. static variable or class variable. --> can use without initialization.
		2. non-static variable or instance variable. --> can use without initialization.
		3. local variable. --> always needs to be initialized before we use it.
*/