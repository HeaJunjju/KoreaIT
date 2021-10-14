package webdeveloper_one.java.exam;

public class For_while_dowhile {

	public static void main(String[] args) {

		// for: 2~10까지의 합
		int sum = 0;
		for (int i = 2; i <= 10; i++) {
			sum += i;
		}
		System.out.println("For문 2~10까지의 합 = " + sum);

		// while: 3~11까지의 합
		int init = 2;
		sum = 0;
		while (++init <= 11) {
			sum += init;
		}
		System.out.println("while문 3~11까지의 합 = " + sum);

		// dowhile: 4~12까지의 합
		init = 4;
		sum = 0;
		do {
			sum += init;
		} while (++init <= 12);
		System.out.println("dowhile문 ﻿4~12까지의 합 = " + sum);
	}

}
