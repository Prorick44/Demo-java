import java.util.Scanner;

class Tribonacci
{
	public static void main(String[] args) 
	{
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a number:- ");
		int n = sc.nextInt();
		int a = 0;
		int b = 1;
		int c = 1;
		System.out.println("Tribonacci series is:- ");
		System.out.print(a + "," + b + "," + c);
		for(int i=4;i<=n;i++) {
			int d = a + b + c;
			System.out.print("," + d);
			a = b;
			b = c;
			c = d;
		}
	}
}
