class E 
{
	static int i; // initialization is not mandatory is here 
	static double d;
	static char c;
	static boolean b;
	static String s;
	public static void main(String[] args) 
	{
		System.out.println(i); // without initialization we can access it as it is a static variable having a default value.
		System.out.println(d);
		System.out.println(c);
		System.out.println(b);
		System.out.println(s);
	}
}

/*
	default values for static or non-static datatypes in java:-
		1. byte, short, int, long ---> 0
		2. float, double ---> 0.0
		3. boolean ---> false 
		4. char ---> empty character
		5. any non-primitive datatype ---> null
*/