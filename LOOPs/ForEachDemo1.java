class ForEachDemo1
{
	public static void main(String[] args) 
	{
		int[] a = {10, 20, 30};
		System.out.println("Iterating using for loop:- ");
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Iterating using for-each loop:- ");
		for (int n : a)
		{
			System.out.println(n);
		}
	}
}
