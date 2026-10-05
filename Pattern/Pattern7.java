import java.util.Scanner;

class Pattern7
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:- ");
		int n = sc.nextInt();
		int count = n;
		int temp = 1;
		for (int i=1;i<=n;i++)
		{
			if (i%2 != 0)
			{
				for (int j=temp;j<=count;j++)
				{
					System.out.print(j);
				}
				temp = count;
				count = temp + n;
			}
			else {
				for (int j=count;j>temp;j--)
				{
					System.out.print(j);
				}
				temp = count + 1;
				count = temp + n - 1;
			}
			System.out.println();
		}
	}
}
