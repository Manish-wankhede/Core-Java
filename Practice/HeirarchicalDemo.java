// WAP to demonstrate Heirarchical inheritace in java

class A{
	void display1(){
		System.out.print("\n Display - class A");
	}
}
class B extends A{
	void display2(){
		System.out.print("\n Display - class B");
	}
}
class C extends A{
	void display3(){
		System.out.print("\n Display - class C");
	}
}
class HeirarchicalDemo{
	public static void main(String args[]){
		B obj = new B();
		System.out.print("Class B");
		obj.display1();
		obj.display2();

		C obj2 = new C();
		System.out.print("\n\n Class C");
		obj2.display1();
		obj2.display3();
	}
}
		