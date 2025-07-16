// WAP to demonstrate multiple inheritance in java

class A
{
	void display1()
	{
		System.out.print("\n Display - class A");
	}
}
class B extends A
{
	void display2()
	{
		System.out.print("\n Display - class B");
	}
}
class C extends B
{
	public void display3()
	{
		System.out.print("\n Display - class C");
	}
}
class MultipleDemo
{
	public static void main(String args[])
	{
		C obj = new C();
		obj.display1();
		obj.display2();
		obj.display3();
	}
}
	