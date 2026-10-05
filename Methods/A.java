class A 
{
	public static void main(String[] args) 
	{
		m1();// executing m1
		int n = m1();
		System.out.println("n" + n); // executing m1 and 10
		int j = m1() * 4;
		System.out.println("j" + j); // executing m1 and 40
		System.out.println(m1()); // executing m1 and 10
	}
	static int m1() {
		System.out.println("Executing m1");
		return 10;
	}
}
