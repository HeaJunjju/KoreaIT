package webdeveloper_one.java.child;

public class Object_1 extends Object {

	// Object: 모든 클래스는 반드시 Object를 상속받는다.
	// 모든 클래스의 부모는 Object이다.
	// 자바에서의 상속의 클래스는 하나만 받을 수 있다. (Object 예외)
	// 인터페이스는 무한으로 받을 수 있다.

	String name = "아무개";

	// Object를 상속받지 않는 클래스는 자바가 아니다. (예: native)
	public static void main(String[] args) {
//		String name = "홍길동";
//		System.out.println(name);

		// Object(클래스)
		// 모든 클래스의 부모는 Object 이다.
		// 부모형은 자식의 형을 가질 수 있다.

//		String strvalue = new String("아무개");
//		// toString(): 실제 값을 가져온다.
//		System.out.println(strvalue.toString());

		Object_1 ob = new Object_1();
		System.out.println("Object : " + ob.getClass().getName());

		String name = "문자열";
		System.out.println("String : " + name.getClass().getName());

		Object obvalue = new String("문자열2");
		System.out.println("Object_String : " + obvalue.getClass().getName());

		if (obvalue.equals("문자열2")) {
			System.out.println("문자열 검색");
		}

		// int: api를 사용할 수 없다.
		int age = 10;
		System.out.println(age);

		// Integer: wrapper(포장) 클래스
		Integer age2 = 20;
		System.out.println("Integer : " + age2.getClass().getName());

		Object intvalue = new Integer(1); // Object:부모, Integer:자식
		System.out.println("Object_Integer: " + intvalue.getClass().getName());

	}
}
