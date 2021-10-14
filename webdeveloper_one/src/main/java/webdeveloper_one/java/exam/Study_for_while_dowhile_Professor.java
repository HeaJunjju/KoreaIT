package webdeveloper_one.java.exam;

public class Study_for_while_dowhile_Professor {

	public static void main(String[] args) {

		/*
		 * 1~20까지의 합에서 3,7,9,13 을 빼고 짝수의 합, 홀수의 합을 출력
		 */

		// i++ 같은 구문은 for, while, dowhile에는 쓰지 않는게 좋음
		System.out.println("=========For==========");
		int start = 1;
		int max = 20;
		int evensum = 0;
		int oddsum = 0;

		for (; start <= max; start++) {
			if (!(start == 3 || start == 7 || start == 9 || start == 13)) {
				if (start % 2 == 0) {
					evensum += start;
				} else if (start % 2 == 1) {
					oddsum += start;
				}
			}
		}

		System.out.println("짝수의 합: " + evensum + ", 홀수의 합: " + oddsum + "\n");

		System.out.println("========While=========");

		start = 0;
		max = 20;
		evensum = 0;
		oddsum = 0;

		while (++start <= max) {
			if (!(start == 3 || start == 7 || start == 9 || start == 13)) {
				if (start % 2 == 0) {
					evensum += start;
				} else if (start % 2 == 1) {
					oddsum += start;
				}
			}
		}
		System.out.println("짝수의 합: " + evensum + ", 홀수의 합: " + oddsum + "\n");

		System.out.println("========dowhile=======");
		start = 1;
		max = 20;
		evensum = 0;
		oddsum = 0;

		do {
			if (!(start == 3 || start == 7 || start == 9 || start == 13)) {
				if (start % 2 == 0) {
					evensum += start;
				} else if (start % 2 == 1) {
					oddsum += start;
				}
			}
		} while (++start <= max);

		System.out.println("짝수의 합: " + evensum + ", 홀수의 합: " + oddsum + "\n");
	}
}
