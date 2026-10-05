import java.util.*;

class Prime
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.print("\n Enter lower range:- ");
		int a = sc.nextInt();
		System.out.print("\n Enter upper range:- ");
		int b = sc.nextInt();
		System.out.print("\n Prime numbers:- ");
		for (int i=a;i<=b;i++)
		{
			if (is_Prime(i))
				System.out.print(i + " ");
		}
	}
	
	static boolean is_Prime(int n) {
		if (n<=1)
			return false;
		for (int i=2; i<=n/2;i++)
		{
			if (n%i==0)
				return false;
		}
		return true;
	}
}
