package webdeveloper_one.java;

public class Method_2 {
	public String name = "이순신";

	public void Print() {
		System.out.println("이름은 " + name);
	}

	public void input(String name, int age, String addr) { // 인자(argument) 메소드에서 인자는 무한으로 올 수 있다.
		System.out.println("이름: " + name + " 나이: " + age + " 주소: " + addr);
	}

	public static void main(String[] args) {
		Method_2 obj = new Method_2();

		obj.Print();
		obj.input("홍길동", 20, "조선");
 
	}

}
