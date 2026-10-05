class Book
{
	String title;
	double price;
	int pages;
}

class B
{
	public static void main(String[] args) 
	{
		Book b1 = new Book();
		
		b1.title = "java";
		b1.price = 350.;
		b1.pages = 400;
		System.out.println(b1.title);
		System.out.println(b1.price);
		System.out.println(b1.pages);
		
		Book b2 = new Book();
		b2.title = "Python";
		b2.price = 340.9;
		b2.pages = 398;
		System.out.println(b2.title);
		System.out.println(b2.price);
		System.out.println(b2.pages);
	}
}
