import java.util.Scanner;

class Prime_Max_Range
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower range:-");
		int m = sc.nextInt();
		System.out.println("Enter upper range:-");
		int n = sc.nextInt();
		int max = m;
		System.out.print("The prime number:- ");
		for (int i=m;i<=n;i++)
		{
			if (i<=1)
				continue;
			boolean flag = true;
			for (int j=2;j<i/2;j++)
			{
				if (i%j == 0)
				{
					flag = false;
					break;
				}
			}
			if (flag){
				if (i > max)
					max = i;
			}	
		}
		System.out.println("The largest prime number is :- " + max);
	}
}
