// WAP to demonstrate the hybride inheritace in java

class A{
	void display1(){
		System.out.print("\n Display - Class A");
	}
}
class B extends A{
	void display2(){
		System.out.print("\n Display - class B");
	}
}
interface C{
	void display3();
}
class D extends B implements C{
	public void display3(){
		System.out.print("\n Display - Interface C");
	}
}
class HybrideDemo{
	public static void main(String args[]){
		D obj = new D();
		
		obj.display1();
		obj.display2();
		obj.display3();
	}
}