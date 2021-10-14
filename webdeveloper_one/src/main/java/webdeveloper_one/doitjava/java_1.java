package webdeveloper_one.doitjava;

public class java_1 {
	// jvm에서 main 호출(call) 한다
	public static void main(String[] args) {
		// 고급언어 : 컴퓨터와 멀리 있을수록 고급 언어(예: java)
		// 저급언어: 컴퓨터와 가까이 있을수록 저급 언어

		// 자바의 특징
		// 가상머신이 있기 때문에 이식성이 좋다.(다른 언어는 이식이 없다.)

		// *.java 소스코드(개발자), *.class 컴파일된 코드를 jvm가 해석한다.
		// jdk: java development kit -> 자바 개발키트
		// jsdk: java standard development kit ->
		// j2ee(java enterprise edition), ejb(enterprise java bean) -> weblogic
		// (component)

		System.out.println("문자열 입니다.");

		// 변수: 저장하기 위해 사용하는 것
		// call by value만 있다.
		// 값을 이동시킨다.
		// 컴파일 되고나서 실행속도는 빠르다.
		// c, c++, c# : call by reference 포인터(가리킨다)
		// 변수: 오른쪽에서 왼쪽으로 간다.(실제 값이 이동)
		// 더블쿼터: 문자열을 나타낸다

		String strvalue = "문자열";

		System.out.println("출력 : " + strvalue);

		String name;
		name = "홍길동";

		System.out.println("이름: " + name);

		String email, address;

		email = "1234@naver.com";
		address = "안산";

		System.out.println("이메일은: " + email);
		System.out.println("주소는: " + address);

		// 초기화: 주소값에 갔더니 null 이 있다
		// 빈공간만 만들고 싶을 때
		String nullvalue = null;
		System.out.println("null값: " + nullvalue);

		// System.out.println(); : 출력하면서 개행(줄바꿈)

		// System.out.print(): 줄바꿈 하지 않음

		System.out.print("줄바꿈 x");

		// 문자: 바이트에 따라서가 아닌 문자에 따라 맞추어진다
		// 영어: 1바이트, 한글(문자): 2바이트
		// 예약어는 변수명, 클래스명, 메소드명으로 쓸 수 없다.
		// 정수형0~10 : 오른쪽에 정수형
		// 자바에서는 정수형을 int형으로 받음
		int age = 10;

		age += 10;

		System.out.println("나이(정수형)는: " + age);

		// 상수: 변수, 메소드, 클래스
		// 상수는 변하지 않음(상속 x)
		// 원시 타입 클래스는 모두 final String, Integer, Long, Double, ...
		final int age2 = 10;

//		age2 = 20; //상수이기 때문에 오류 발생
		System.out.println("나이(final)는: " + age2);

		// 자바는 번지(주소)가 없고 객체가 있기 때문에 객체로만 찾을 수 있다.

		// 자바에서의 문자는 char(Character)이다.
		// char에서의 문자는 싱글쿼터('')로 묶는다.
		char chvalue = '오';
		char chvalue2 = '다';
		char chvalue3 = '희';

		System.out.println("문자1는: " + chvalue);
		System.out.println("문자2는: " + chvalue2);
		System.out.println("문자3는: " + chvalue3);

		String name2 = "오다희";

		// 지역변수: 해당하는 괄호문이 닫히면 자동으로 소멸된다.
		// 전역변수: 값이 당분간 유지가 된다(객체가 살아있을 때)

	}
}
