import java.util.Scanner;

class Tables 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter table number");
		int n = sc.nextInt();
		System.out.println("Enter table rrange");
		int r = sc.nextInt();
		for (int i=1;i<=r;i++)
		{
			System.out.println(n+"*"+i+"="+(n*i));
		}
	}
}
