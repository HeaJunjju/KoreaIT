package webdeveloper_one.java;

public class Method_1 {

	public String name = "홍길동";
	public int age = 10;
	public String addr = " 안산";

	// 접근제한자 리턴타입 메소드명() { return 리턴타입 }
	public String Name() {
		// main()에서 전역변수에 접근하려면 객체생성을 하고 접근이 가능하지만,
		// 다른 메소드는 객체 생성 안하고 접근할 수 있다.
		return name;
	}

	public int Age() {
		return age;
	}

	public String Address() {
		return addr;
	}

	public static void main(String[] args) {
		// 변수: 괄호가 없다.
		// 변수는 하나의 값만 갖는다.
		// 변수 -> 저장(명사)
		// 메소드: 동사
		// 메소드는 괄호가 있다.

//		String name = "아무개";  
//		obj.Name(); 
//		System.out.println(obj.Name());

		// 지역변수: 이름, 나이, 주소 출력
		String name = "오다희";
		int age = 23;
		String addr = "청주";
		System.out.println("1) 지역변수 -> 이름: " + name + ", 나이: " + age + ", 주소: " + addr);
		// 전역변수: 이름, 나이, 주소 출력
		Method_1 obj = new Method_1();
		System.out.println("2) 전역변수 -> 이름: " + obj.name + ", 나이: " + obj.age + ", 주소: " + obj.addr);

		// 이름, 나이, 주소 메소드 출력
		System.out.println("3) 메소드 -> 이름: " + obj.Name() + ", 나이: " + obj.Age() + ", 주소: " + obj.Address());
	}

}
