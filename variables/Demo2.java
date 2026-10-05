class Demo2 
{
	public static void main(String[] args) 
	{
		Demo1 d1;
		d1 = new Demo1(); // address of the object is assigned here
		System.out.println(d1);
		
		Demo2 d2;
		d2 = new Demo2();
		System.out.println(d2);
		
		Demo1 d3 = new Demo1(); // Valid
		System.out.println(d3);
	}
}
