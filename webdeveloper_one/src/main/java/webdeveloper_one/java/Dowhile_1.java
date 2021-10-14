package webdeveloper_one.java;

public class Dowhile_1 {

	public static void main(String[] args) {

//		do {} while: 무조건 한 번은 실행이 되고, 조건식이 true일때까지 괄호문 실행

		int init = 0;

		do {
			System.out.println(init);
		} while (++init <= 10);

		init = 0;
		int sum = 0;
		// 1~10까지의 합을 구하시오.
		do {
			sum += init;
		} while (++init <= 10);
		
		System.out.println(sum);
	}

}
