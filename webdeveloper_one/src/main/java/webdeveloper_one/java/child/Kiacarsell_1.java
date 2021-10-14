package webdeveloper_one.java.child;

import java.util.HashMap;

public class Kiacarsell_1 implements Commoncar {

	@Override
	public void Carname(String name) {
		System.out.println("차 이름은: " + name);
	}

	@Override
	public void Carprise(String price) {
		System.out.println("차 가격은: " + price);
	}

	public void Print() {
		System.out.println("출력");
	}

	public static void main(String[] args) {
		Commoncar ccar = new Kiacarsell_1();
		Commoncar hcar = new Hyundaicarsell_1();

		// 자동차 100개
		// 공통: 모듈을 만들면 재사용할 수 있다.

		// k7 가격 4000 풀옵션
//		ccar.Carname("K7");
//		ccar.Carprise("4000");
//
//		hcar.Carname("gv70");
//		hcar.Carprise("5000");

		// new 쓰지 않고 객체 생성
		// 에러 처리 Exception: 에러가 날 만한 코드에서 에러처리를 한다.
		// network, io 객체 생성, jdbc, port 생성은 반드시 에러처리를 해주어야 한다.
		// 모든 에러처리의 부모는 Exception
		// 자식은 부모에 있는 것을 쓸 수 있다.
		// 자식이 더 크다
		// 자식은 부모 타입에 포함이 된다 부모가 제일 크다,,,

//		try {
//			Class.forName("webdeveloper_one.java.child.Kiacarsell_1").newInstance();
//
//		} catch (Instantiation e) {// InstantiationException: 객체생성하다가 에러 발생 시
//			// TODO Auto-generated catch block
//			e.printStackTrace(); // printStackTrace(): 에러문 출력
//		} catch (IllegalAccessException e) { // IllegalAccessException: 접근하다가 접근거부
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (ClassNotFoundException e) { // ClassNotFoundException: 클래스가 없으면 에러
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		try {
			// 실행할 때
			Commoncar com = (Commoncar) Class.forName("webdeveloper_one.java.child.Kiacarsell_1").newInstance(); // 업캐스팅

			HashMap hash = new HashMap();

			hash.put("kia", "webdeveloper_one.java.child.Kiacarsell_1");
			hash.put("Hyundai", "webdeveloper_one.java.child.Hyundaicarsell_1");

			System.out.println(hash.get("kia"));
			System.out.println(hash.get("Hyundai"));

			com.Carname("카렌스2");
			com.Carprise("1000");

		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
