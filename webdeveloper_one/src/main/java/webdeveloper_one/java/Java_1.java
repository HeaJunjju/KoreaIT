package webdeveloper_one.java;

//public: 누구나 접근 가능한 접근제한자
//protected: 해당하는 패키지만 접근 가능
//private: 현재 클래스에서만 접근 가능

//접근제한자 class 클래스명{}
public class Java_1 {
	// 전역변수
	public String name = "홍길동";
	public int age = 10;
	public String addr = "안산";

	// JVM 호출하는 main() 메소드(함수)
	public static void main(String[] args) {
//		System.out.println("1");
//		System.out.println("2");
//		System.out.println("3");
//		System.out.println("4");
//		System.out.println("5");

		// local var(지역변수): 해당하는 괄호가 닫히면 값이 자동으로 소멸됨.
		String name = "오다희";

		System.out.println("이름은: " + name);

		// obj = 객체
		// new : 객체를 생성하는 예약어
		// new -> 가비지 컬렉터: 메모리에서 쓰지 않는 객체가 있으면 자동 소멸(release)

		Java_1 obj = new Java_1();

		System.out.println("전역변수 이름: " + obj.name);
		System.out.println("전역변수 나이: " + obj.age);
		System.out.println("전역변수 주소: " + obj.addr);

		// 객체지향언어: C, JAVA, C++, C#
		// 지구, 대한민국, 서울, 서초구, 양재동, 66-3, 5층, 502호
		// 큰 곳에서 작은 곳으로 가는 것.

	}

}
