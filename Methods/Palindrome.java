class Palindrome
{
	public static boolean palindrome(int n, int m, int rev) {
		if (n==0) return (rev == m);
		int r = n%10;
		return palindrome(n/10, m,rev*10+r);
	}
	public static void main(String[] args) 
	{
		System.out.println(palindrome(121,121,0));
	}
}
