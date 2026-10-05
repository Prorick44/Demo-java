import java.util.Scanner;

class Pattern12_II
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:- ");
		int n = sc.nextInt();
		int spaces=n-1, stars=1;
		for (int i=1;i<=n;i++)
		{
			for (int j=0;j<spaces;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=stars;j++)
			{
				if (j==1||j==stars||i==n)
				{
					System.out.print("*");
				}
				else{
					System.out.print(" ");
				}
			}
			System.out.println();
			spaces--;
			stars+=2;
		}
	}
}
