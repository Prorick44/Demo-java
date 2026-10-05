import java.util.Scanner;

class Fibonacci_limit
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a range:- ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		System.out.println("Fibonacci series is:- ");
		System.out.print(a + "," + b);'
		int i=3;
		while (n>0) {
			int c = a + b;
			System.out.print("," + c);
			a = b;
			b = c;
			n -= c;
		}
	}
}
