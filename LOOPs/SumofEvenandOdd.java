class SumofEvenandOdd 
{
	public static void main(String[] args) 
	{
		int evenSum = 0;
		int oddSum = 0;
		for (int i=0;i<=10;i++)
		{
			if (i % 2 == 0)
				evenSum = evenSum + i;
			else 
				oddSum = oddSum + i;
		}
		System.out.println(evenSum);
		System.out.println(oddSum);
	}
}
