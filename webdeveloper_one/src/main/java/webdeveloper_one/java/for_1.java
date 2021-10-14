package webdeveloper_one.java;
 
public class for_1 {

	public static void main(String[] args) {

		/*
		 * 생략 가능 : 초기식;조건식;증감식 
		 * 
		 * for(초기식; 조건식; 증감식) { 
		 * 조건식이 맞으면(true) 괄호 실행
		 * 
		 * 초기식 조건식? -> true 괄호실행 증감식 +1 증가 
		 * 초기식 조건식? -> true 괄호실행 증감식 +1 증가
		 *  }
		 *
		 */

		for (int i = 0; i <= 10; i++) {

			System.out.println(i);
		}

		// 문제
		// 1~10까지의 합을 구하세요.

		int sum = 0; 

		for (int i = 1; i <= 10; i++) {
			sum += i;
		}

		System.out.println("합: " + sum);
	}
}
