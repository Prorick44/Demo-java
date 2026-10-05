class D 
{
	public static void main(String[] args) 
	{
		// BITWISE Operators
		int a =38;
		System.out.println(a);
		
		int b = -71;
		System.out.println(b);
		
		int c = a & b;
		System.out.println(c); // 32
		
		int d = a | b;
		System.out.println(d); // -65
		
		int e = a ^ b;
		System.out.println(e); // -97
		
		int f = ~a;
		System.out.println(f); // -39
		
		int g = ~b;
		System.out.println(g); // 70
		
		// >> signed right shift the blank spaces will be filled with signed bit numbers only
		a = 38;
		b = a >> 2;
		System.out.println(b); // 9
		
		a = -71;
		b = a >> 2;
		System.out.println(b); // -18
		// >>> unsigned right shift the blank spaces will be filled with 0 always
		// << left shift the last empty bits will always be filled with 0 and the resultant number sign can not be determined previously
		a = 38;
		b = a << 2;
		System.out.println(b); // 152
		// you can shift the bits from 0 to 31 if greater than 31 shift bit comes the result will be shift of 32 modulus result number of right.
	}
}
