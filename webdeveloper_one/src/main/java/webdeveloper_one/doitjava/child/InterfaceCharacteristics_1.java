package webdeveloper_one.doitjava.child;

abstract interface A3{
	public static final int a = 3;
	public abstract void abc();
}

abstract interface B3{
	int b = 3;
	abstract void bcd();
}

public class InterfaceCharacteristics_1 {

	public static void main(String[] args) {
//		A3 a3 = new A3();
//		B3 b3 = new B3();
		System.out.println(A3.a);
		System.out.println(B3.b);
	}

}
