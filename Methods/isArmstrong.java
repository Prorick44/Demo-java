class ArmstrongNumber
{
	public static boolean isArmstrong(int n, int m, int sum, int l) {
		if (n == 0) return (m == sum);
		int r = n % 10;
		return isArmstrong(n/10, m, sum+=Math.pow(r,l), l);
	}
	public static void main(String[] args) 
	{
		System.out.println(isArmstrong(153, 153, 0, 3));
	}
}
