class C 
{
	static int i = 10; // general variable any one can access it through class from any method. 
	public static void main(String[] args) 
	{
		System.out.println(i); // if present in same class no class name is required to call static variable else we need the classname.
		C.i = 20;
		System.out.println(C.i);
	}
}
