import java.util.Scanner;
/*	 
	* next(); and nextLine(); ---> String 
	* nextInt(); ---> int 
	* nextByte(); ---> byte
	* nextLong(); ---> long
	* nextFloat(); ---> float 
	* nextShort(); ---> short
	* nextDouble(); ---> double 
	* nextBoolean(); ---> boolean
*/
class A 
{
	public static void main(String[] args) 
	{
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter 2 numbers");
		int a = sc.nextInt();
		int b = sc.nextInt();
		System.out.println(a + "+" + b + "=" + (a + b));
	}
}
