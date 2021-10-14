package webdeveloper_one.java.child;

//extends: 같은 것 (예: class <- class, interface <- interface)

//interface: 다른 것 (예: class <- interface)

//override: 같은 이름의 메소드나 변수를 자식에서 재정의하는 것
//조건
//1. 리턴타입 (이름(타입(인자 개수))이 자식에 있으면 재정의
//2. 리턴타입 (이름(타입(인자 개수))이 자식에서 똑같지 않으면 오버로딩
public class Childcommon implements Basecommon {
	String name = "김현호";

	@Override // @Override(어노니테이션): 오버라이드 하겠다.
	public void C501(String classname) {
		System.out.println("C501");
	}

	@Override
	public void C502(String classname) {
		System.out.println("C502");
	}

	@Override
	public void C503(String classname) {
		System.out.println("C503");
	}

	public static void main(String[] args) {

		// class: 객체 생성 가능, 몸체 구현 가능
		// class 역할: 실행만 하는 곳
		Childcommon ch = new Childcommon();

		System.out.println(ch.name);

		ch.C501("신입_1");
		ch.C502("신입_2");
		ch.C503("신입_3");
	}
}
