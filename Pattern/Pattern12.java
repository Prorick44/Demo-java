import java.util.Scanner;

class Pattern12
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:- ");
		int n = sc.nextInt();
		for (int i=0;i<n;i++)
		{
			if (i == (n-1) || i == 0)
			{
				for (int j=0;j<n - i - 1;j++)
				{
					System.out.print(" ");
				}
				for (int j=1;j<=(2*i+1);j++)
				{
					System.out.print("*");
				}
			}
			else {
				for (int j=0;j<n - i - 1;j++)
				{
					System.out.print(" ");
				}
				System.out.print("*");
				for (int j=0;j<2*i - 1;j++)
				{
					System.out.print(" ");
				}
				System.out.print("*");	
			}
			System.out.println();
		}
	}
}
