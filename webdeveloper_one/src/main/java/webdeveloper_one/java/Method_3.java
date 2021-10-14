package webdeveloper_one.java;

public class Method_3 {

	public String moivename = "오징어게임";
	public String movieaddress = "대한민국";
	public int movieage = 2021;

	// 기본 생성자: 인자가 없는 생성자
	public Method_3() {
		System.out.println("기본 생성자 입니다.");
	}

	// 웹 -> 파라미터
	// 자바 - >인자(아규먼트)가 있는 생성자
	// 인자가 있는 생성자를 선언하면 기본 생성자를 생략할 수 없고, 반드시 선언해야 한다.
	public Method_3(String name, String address) {
		System.out.println("이름: " + name + ", 주소: " + address);
	}

	public Method_3(String moivename, String movieaddress, int movieage) {
		this.moivename = moivename;
		this.movieaddress = movieaddress;
		this.movieage = movieage;
	}

	public String getMoivename() {
		return moivename;
	}

	public void setMoivename(String moivename) {
		// 지역변수와 전역변수의 변수 이름이 같으면 전역변수 앞에 this 붙임
		this.moivename = moivename;
	}

	public String getMovieaddress() {
		return movieaddress;
	}

	public void setMovieaddress(String movieaddress) {
		this.movieaddress = movieaddress;
	}

	public int getMovieage() {
		return movieage;
	}

	public void setMovieage(int movieage) {
		this.movieage = movieage;
	}

	public static void main(String[] args) {

		// 생성자: 생성자도 괄호가 있으므로 메소드이다.
		// 이미 타입이 클래스 타입으로 정해져 있다.
		// 어떤 타입들을 받을 때, 편하게 받을 수 있다.
		// 기본 생성자는 생략 가능

		Method_3 obj = new Method_3();
		obj.setMoivename("D.P");
		obj.setMovieaddress("한국");

		System.out.println("영화이름: " + obj.getMoivename() + ", 영화주소: " + obj.getMovieaddress());
		Method_3 obj2 = new Method_3("광개토대왕", "30");
		System.out.println("=======================================");
		obj2.setMoivename("컨저링3");
		obj2.setMovieaddress("미국");
		System.out.println("영화이름: " + obj2.getMoivename() + ", 영화주소: " + obj2.getMovieaddress());

		System.out.println("=======================================");
		Method_3 obj3 = new Method_3("소스코드", "미국", 2008);
		System.out.println("영화이름: " + obj3.getMoivename() + ", 영화주소: " + obj3.getMovieaddress() + ", 영화제작년연도: " + obj3.getMovieage()  );
	}
}
