import java.util.Scanner;

class Happy_Number
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int n = sc.nextInt();
		int sum = 0;
		while (n!=1 && n!=4)
		{
			sum = 0;
			while (n > 0)
			{
				int r = n % 10;
				sum += Math.pow(r, 2);
				n/=10;
			}
			n = sum;
		}
		System.out.println(sum);
	}
}
