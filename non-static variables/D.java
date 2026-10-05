class C
{
	static int i;
	int j;
	
	static void m1(){
		System.out.println("m1");	
	}
}

class D
{
	public static void main(String[] args) 
	{
		System.out.println("execution starts");// class C is not loaded in JVM till now
		C.m1(); // class C will be loaded into JVM(present in RAM) here for the first time and static variable will also be initialized here.
		C.i = 20;
		C c1 = new C();// non-static variable will be initalized here
		c1.j = 30;
		System.out.println(C.i);
		System.out.println(c1.j);	
	}
}
