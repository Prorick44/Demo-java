class LCM
{
	public static void main(String[] args) 
	{
		int a = 12;
		int b = 10;
		int max = a>b?a:b;
		while (true)
		{
			if (max%a==0 && max%b==0)
			{
				System.out.println(max);
				break;
			}
			max++;
		}
	}
}
