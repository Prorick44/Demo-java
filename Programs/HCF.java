class HCF
{
	public static void main(String[] args) 
	{
		int a = 6;
		int b = 12;
		int min = a<b?a:b;
		int hcf=0;
		for (int i=1;i<=min;i++)
		{
			if (a%i==0 && b%i==0)
				hcf = i;
		}
		System.out.println(hcf);
	}
}
