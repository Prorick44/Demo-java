class Demo
{
	public static void m1() {
		System.out.println("m1()-Executed");	
	}
	public static void main(String[] args) 
	{
		System.out.println("Main-Executed"); // first
		Demo.m1(); // second
		Demo d = new Demo();
		d.m2(); // third
	}
	void m2() {
		System.out.println("m2()-Executed");// third
		Demo.m1();// fourth
	}
}
