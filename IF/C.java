class C 
{
	public static void main(String[] args) 
	{
		int a = 5;
		if (a%2 == 0)
		++a; // Part of if condition
		++a; // 6
		++a; // 7
		System.out.println(a); // 7
	}
}
