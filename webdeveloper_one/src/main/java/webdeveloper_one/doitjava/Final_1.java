package webdeveloper_one.doitjava;

public class Final_1 {
	public static String name = "전역이름";
	
	public static void main(String[] args) {
		final String name = "홍길동";
//		name = "아무개";		//=>final걸면 값이 변경이 안됨
		System.out.println(name);
		
		System.out.println(Final_1.name);
		
		Final_1.name = "오징어";
		System.out.println(Final_1.name);
	}

}
