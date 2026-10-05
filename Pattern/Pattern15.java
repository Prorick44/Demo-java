import java.util.Scanner;

class Pattern15
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number of rows:- ");
		int n = sc.nextInt();
		int spaces=n/2, stars = 1;
		for (int i=1;i<=n;i++)
		{
			for (int j=1;j<=spaces;j++)
			{
				System.out.print(" ");
			}
			for (int j=1;j<=stars;j++)
			{
				if (j==1 || j==stars)
					System.out.print("*");
				else
					System.out.print(" ");
			}
			System.out.println();
			if (i<=n/2){
				stars+=2;	
				spaces--;
			}
			else {
				spaces++;
				stars-=2;
			}
		}
	}
}
