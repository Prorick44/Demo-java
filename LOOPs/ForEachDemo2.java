class ForEachDemo2
{
	public static void main(String[] args) 
	{
		String[] a = {"java", "python", "sql", "c", "c++"};
		System.out.println("Iterating using for loop:- ");
		for (int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		System.out.println("Iterating using for-each loop:- ");
		for (String s : a)
		{
			System.out.println(s);
		}
	}
}
