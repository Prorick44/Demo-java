class isPrime 
{
	public static boolean isPrime(int n, int i) {
		if (i == 1) return true;
		if (n<=1 || n%i == 0) return false;
		return isPrime(n, i-1);
	}
	public static void main(String[] args) 
	{
		System.out.println(isPrime(5,2));
	}
}
