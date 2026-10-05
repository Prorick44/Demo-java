import java.util.Scanner;

class Pattern5
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:- ");
		int n = sc.nextInt();
		for (int i=1;i<=n;i++)
		{
			for (int j=n;j>=i;j--)
			{
				if (j==i)
				{
					System.out.print(j);
				}
				else {
					System.out.print(j);
					System.out.print("*");
				}
			}
			System.out.println();
		}
	}
}
