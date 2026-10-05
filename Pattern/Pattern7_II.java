import java.util.Scanner;

class Pattern7_II
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:- ");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			if (i%2 != 0)
			{
				int count = ((i-1)*n)+1;
				for (int j=1;j<=n;j++)
				{
					System.out.print(count);
					count++;
				}
			}
			else {
				int count = i * n;
				for (int j=1;j<=n;j++)
				{
					System.out.print(count);
					count--;
				}
			}
			System.out.println();
		}
	}
}
