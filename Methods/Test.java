class Test
{
	public static void m1(int i) {
		i += 10;
		System.out.println(i);
	}
	public static void main(String[] args) 
	{
		int i = 10;
		System.out.println(i); // 10
		m1(i); // 20
		System.out.println(i); // 10
	}
}