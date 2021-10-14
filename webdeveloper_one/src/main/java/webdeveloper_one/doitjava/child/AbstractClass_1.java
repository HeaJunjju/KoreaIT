package webdeveloper_one.doitjava.child;

abstract class A{
	abstract void abc();
}

class B extends A{

	@Override
	void abc() {
		System.out.println("오버라이딩된 메소드");
	}
	
}

public class AbstractClass_1 {

	public static void main(String[] args) {
		
		A a1 = new B();
		B b2 = new B();
		
		//부모의 메소드
		a1.abc();
		//부모 메소드 <- 오버라이딩된 메소드
		b2.abc();

	}

}
