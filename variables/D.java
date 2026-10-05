class D 
{
	static int j = 10;
	public static void main(String[] args) 
	{
		m1();
		D.j = 50; // any body can access and update the static data.
		m1();
	}
	public static void m1() {
		System.out.println("m1 starts");
		System.out.println(D.j); // class name is not mandatory as it is present in the same class file.
		System.out.println("m1 ends");
	}
}
