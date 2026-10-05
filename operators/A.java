class A 
{
	public static void main(String[] args) 
	{
		int a = 5;
		a += 3;
		System.out.println(a); // 8
		a -= 3;
		System.out.println(a); // 5
		a =+ 3;
		System.out.println(a); // 3
		a =- 3;
		System.out.println(a); // -3
		a *= 3;
		System.out.println(a); // -9
		a /= 3;
		System.out.println(a); // -3
		// a =* 3 // Compile Time Error same for a =/ 3
		
		int m=40, n=50;
		System.out.println(m + "+" + n + "=" + m + n); // 40 + 50 = 4050
		System.out.println(m + "+" + n + "=" + (m+n)); // 40 + 50 = 90
		
		System.out.println('a' + 1); // 98 ascii value of a 97 + 1 = 98
		System.out.println("a" + 1); // a1
		System.out.println('a' + '1'); // ascii value of a 97 + ascii value of character 1 49 = 146
		
		// ascii value of a starts with 97 and ascii value of character 0 is 48
		
		int b = 5;
		b += '2'; // ascii value of 2 is 50 + 5 = 55
		System.out.println(b); // 55
		
		char c = '5';
		if ((c>=48) && (c<=57)) // ((c >= '0') && (c <= '9')) 
		{
			System.out.println("represents digit");
		}
		else {
			System.out.println("not a digit");
		}
		
		if (c>='0' && c<='9')
		{
			System.out.println(c-'0'); // 5
		}
		
		System.out.println(a == 5); // true
		System.out.println(!(a==5)); // false
		// System.out.println(!a == 5); // compile time error
	}
}
