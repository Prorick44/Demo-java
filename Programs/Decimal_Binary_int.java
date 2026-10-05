import java.util.Scanner;

class Decinal_Binary_int
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a Decimal number:- ");
		int n = sc.nextInt();
		int i = 1;
		int bin = 0;
		System.out.print("\nIts Binary is:- ");
		while (n!=0)
		{
			int d = n % 2;
			bin += d * i;
			i *= 10;
			n /= 2;
		}
		System.out.print(bin);
	}
}
