package webdeveloper_one.java;

//클래스는 자바에서 실행할 수 있는 곳이다.
public class Var_1 {
	// main(): 자바 jvm에서 호출
	public static void main(String[] args) {
		// 변수: 변하는 값, 변할 수 있음
		// 변수는 오른쪽에서 왼쪽으로 간다.
		// 자바는 call by value만 있다.
		// call by reference는 포인터인데 자바에서는 없다.

		// 출력
		System.out.println("말을 한다.");

		// String: 문자열 타입에 대한 자바 타입 선언
		// 자바에서의 문자열은 더블쿼터("") 쌍으로 이루어진다.
		// 변수이기 때문에 변할 수 있고, 오른쪽에서 왼쪽으로 간다.
		// 변수 <-> 상수
		String name = "오다희";

		name = "홍길동";
		System.out.println("이름은 : " + name);

		String address = "안산";

		System.out.println("주소는 : " + address);

		// 인텔릴전스: 자동 완성(ctrl+space)
		address = "하와이";

		System.out.println("주소는: " + address);
	}
}
