class A
{
	void display()
	{
		System.out.print("\n Supar Class Display");
	}
}
class B extends A
{
	void display2()
	{
		System.out.print("\n Sub Class Display");
	}
}
class SingleDemo
{
	public static void main(String args[])
	{
		B obj = new B();
		obj.display();
		obj.display2();
	}
}
		