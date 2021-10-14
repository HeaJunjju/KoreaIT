package webdeveloper_one.doitjava;

public class Gvar_1 {

	// 접근제한자 타입 변수이름
	// 초기화를 할 필요가 없다
	// 선언
	// lifecycle: 주기 -> 객체 주기가 다하면(가비지 컬렉터가 일어나면) 소멸
	// 가비지컬렉터: vm들고있다가 쓰지 않는 객체가 있으면 자동으로 소멸. 우선순위를 정할 수 있다.

	public String name;

	// 큰데서 작은데로 이동 -> 객체 지향
	// 대한민국. 서울. 서초구. 양재동. 한국it. 5층. 502

	public static void main(String[] args) {

		// 지역변수는 반드시 초기화를 해주어야한다
		// 지역변수는 접근제한자가 오지 않는다
		String name = "최소영";
		System.out.println(name);

		// new: 객체 생성
		Gvar_1 ob = new Gvar_1();
		ob.name = "movie";

		System.out.println(ob.name);

	}

}
