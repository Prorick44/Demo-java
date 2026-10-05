class ForEachDemo3
{
	public static void main(String[] args) 
	{
		int[] a = {10, 20, 30};
		for (int i=0;i<a.length;i++)
		{
			a[i]++;
		}
		System.out.println("For loop:- ");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
		for (int n : a)
		{
			n++;
		}
		System.out.println("For Each-loops:-");
		System.out.println(a[0]);
		System.out.println(a[1]);
		System.out.println(a[2]);
	}
}
