import java.util.Scanner;
class Strong
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		while (n > 0)
		{
			int d = n % 10;
			int fact = 1;
			for (int i=1;i<=d;i++)
			{
				fact *= i;
			}
			sum += fact;
			n /= 10;
		}
		if (temp == sum)
			System.out.println(temp + " is a strong number");
		else 
			System.out.println(temp + " is not a strong number");
	}
}
