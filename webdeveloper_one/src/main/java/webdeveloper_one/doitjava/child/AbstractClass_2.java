package webdeveloper_one.doitjava.child;

abstract class A2{
	abstract void abc();
}

public class AbstractClass_2 {

	public static void main(String[] args) {
		A2 a = new A2() {
			
			@Override
			void abc() {
				System.out.println("오버라이딩된 메소드 ");
			}
		};
	}

}
