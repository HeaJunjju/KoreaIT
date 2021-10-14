package webdeveloper_one.java.wrapper;

//import: 패키지를 받겠다.
//라이브러리를 쓰겠다.
//java.lang 패키지에 있는 것은 생략 가능
import java.lang.String;

public class String_1 {
	public static void main(String[] args) {

//		// System.out.println(name.indexOf("다")); // 출력값: 1
//		Character ch = name.charAt(0);  

//		// 1. charAt()
//		System.out.println("=====1) replace =====");
//		String name = "오다희";
//		String replacename = name.replace(name.charAt(0), '김');
//
//		System.out.println("원래 이름 : " + name);
//		System.out.println("바뀐 이름 : " + replacename);
//
//		// 2. substring()
//		System.out.println("====2) substring() ====");
//		String subname = name.substring(1, name.length());
//		System.out.println("원래 이름 : " + name);
//		System.out.println("자른 이름 : " + subname);
//
//		// 3. tocharArray()
//		System.out.println("===3) tocharArray() ===");
//		char[] array = name.toCharArray();
//
//		System.out.println("원래 이름 : " + name);
//		array[0] = '김';
//		System.out.print("바뀐 이름 : ");
//		for (int i = 0; i < array.length; i++) {
//			System.out.print(array[i]);
//		}

		String name = "오다희";

		System.out.println(name.indexOf("다"));

		String name2 = new String("이순신");
		// toString(): 문자열 값을 가져와 출력한다. -> 생략가능

		System.out.println(name2.toString());

		String name3 = new String(" 이순신 ");

		System.out.println(name3.length());
		System.out.println(name3.trim().length());
	}
}
