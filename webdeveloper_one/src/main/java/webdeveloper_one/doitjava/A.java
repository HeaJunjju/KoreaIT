package webdeveloper_one.doitjava;

//클래스 앞에는 static이 생략되어 있다
public class A {
	public static String name = "홍길동";
	
	public void abc() {
		System.out.println("abc() 메소드 입니다.");
	}

	static class B {
		public void def() {
			System.out.println("def() 메소드 입니다.");
			System.out.println(name);
		}

		static class C {
			public void ghi() {
				System.out.println("ghi() 메소드 입니다");
				System.out.println(name);
			}
		}
	}

	public static void main(String[] args) {
		A a = new A();
//		A.B b = a.new B(); //B에 static 없을 때
//		A.B b = new B(); // B에 static 붙였을 때
		A.B b = new A.B(); // B에 static 붙였을 때
		b.def();
		a.abc();
		
		A.B.C c = new A.B.C();//C에 static을 붙였을 때
		c.ghi();
	}
}
