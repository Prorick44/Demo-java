import java.util.Scanner;

class Pattern7_III
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:- ");
		int n = sc.nextInt();
		int a = 0, b = 0;
		for (int i=1;i<=n;i++)
		{
			if (i%2 != 0)
			{
				for (int j=1;j<=n;j++)
				{
					a++;
					System.out.print(a);
				}
			}
			else {
				b = a + n;
				a = b + 1;
				for (int j=1;j<=n;j++)
				{
					System.out.print(b);
					b--;
				}
			}
			System.out.println();
		}
	}
}
