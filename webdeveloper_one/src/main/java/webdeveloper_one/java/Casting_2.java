package webdeveloper_one.java;

import java.util.ArrayList;
import java.util.List;

public class Casting_2 {
	public static void main(String[] args) {

		// 강제 캐스팅, 자동 캐스팅
		// api 단위 캐스팅이 안되면 업 캐스팅, 다운 캐스팅으로 처리

		// 문자열 > 정수
		// 빅데이터: 타입이 없음(다 문자열)
		String name = "홍길동";
		int age = 20;

		// 정수 -> 문자열: String
		System.out.println("변환x: " + name + age + 10);
		// 자동 형 변환
		System.out.println("정수->문자열(자동 형변환): " + name + (age + 10));

		// 문자열 -> 정수 : Integer
		try {
			// 강제 형변환
			int intvalue = Integer.parseInt("1");
			System.out.println(intvalue);
			// Integer.parseInt("아무개");
		} catch (NumberFormatException e) {
			System.out.println("숫자가 아닙니다.");
		} finally { // 에러가 있든 없든 무조건 실행되는 문
			System.out.println("무조건 실행");
		}

		// 정수 -> 문자열: String
		// 강제 형변환
		String strvalue = String.valueOf(1);
		System.out.println("정수->문자열: " + strvalue);

		// ArrayList: 속도가 배열보다 빠르다.
		// index: 0부터 시작하고 0부터 접근한다.
//		ArrayList array = new ArrayList();
//
//		array.add(1);
//		array.add(2);
//		array.add(3);
//
//		System.out.println("======arrayList======");
//		for (int i = 0; i < array.size(); i++) {
//			System.out.println(array.get(i));
//		}
		System.out.println("========List=======");
		// 업 캐스팅
		List list = (List) new ArrayList(); // (List) 생략 가능

		list.add("아무개");
		list.add("홍길동");

		for (int i = 0; i < list.size(); i++) {
			String strvalue2 = String.valueOf(list.get(i));
			System.out.println("Object - >Stirng(다운 캐스팅): " + strvalue2);
		}
	}
}
