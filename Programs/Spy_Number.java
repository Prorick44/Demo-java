import java.util.Scanner;

class Spy_Number 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int n = sc.nextInt();
		int temp = n;
		int sum = 0;
		int prod = 1;
		while (n != 0)
		{
			int r = n % 10;
			sum += r;
			prod *= r;
			n /= 10;
		}
		if (sum == prod)
			System.out.println(temp + " Spy Number!");
		else 
			System.out.println(temp + " Not a Spy Number!");
	}
}
