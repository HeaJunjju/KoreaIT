package webdeveloper_one.java;

public class while_1 {

	public static void main(String[] args) {
		int init = 0;

		// while문: 조건식이 true 면 괄호문 실행

		while (++init <= 10) {
			System.out.println(init);
		}

		// 2~10까지의 합을 구하시오

		int sum = 0;
		init = 1;
		while (++init <= 10) {
			sum += init;
		}
		System.out.println(sum);
	}
}
