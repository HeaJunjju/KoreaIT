package webdeveloper_one.java.exam;

public class Home {
	public String name = "홍길동";
	public int age = 10;
	public String addr = "안산";
	public String email = "1111@gmail.com";

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public String getAddr() {
		return addr;
	}

	public String getEmail() {
		return email;
	}

	public void Home() {
		System.out.println("이름: " + getName() + ", 나이: " + getAge() + ", 주소: " + getAddr() + ", 이메일: " + getEmail());
	}

	public void Home2(String name, int age, String addr, String email) {
		System.out.println("이름: " + name + ", 나이: " + age + ", 주소: " + addr + ", 이메일: " + email);
	}

	public static void main(String[] args) {
		// 이름, 나이, 주소, 이메일 전역변수

		// retrun 메소드 각각 만들기
		// void Home() 에서 이름, 나이, 주소, 이메일 출력

		// void Home2()에서 (이름, 나이, 주소, 이메일) 출력

		Home home = new Home();
		home.Home();
		home.Home2("이순신", 20, "제주도", "2222@naver.com");
	}

}
