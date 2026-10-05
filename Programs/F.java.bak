import java.util.Scanner;
// Adding all the digits of the number
class F
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number:- ");
		int n = sc.nextInt();
		int sum = 0;
		String s = "";
		while (n!=0)
		{
			int d = n%10;
			if (s.length() == 0)
				s = d + s;
			else 
				s = d + "+" + s;
			sum += d;
			n/=10;
		}
		System.out.print(s + "="+sum);
	}
}
