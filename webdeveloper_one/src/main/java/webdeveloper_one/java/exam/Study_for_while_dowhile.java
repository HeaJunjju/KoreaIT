package webdeveloper_one.java.exam;

public class Study_for_while_dowhile {

	public static void main(String[] args) {

		// 1~20까지의 합에서 3,7,9,13을 빼고 짝수의 합, 홀수의 합 출력

		//ver1
		// 1. for
		int evensum = 0; // 짝수 합
		int oddsum = 0; // 홀수 합
		for (int i = 1; i <= 20; i++) {
			if (!(i == 3 || i == 7 || i == 9 || i == 13)) {
				if (i % 2 == 0) {
					evensum += i;
				} else {
					oddsum += i;
				}
			}
		}
		System.out.println("1. For문 - 짝수 합 = " + evensum + ", 홀수 합 = " + oddsum);

		// 2. while
		int init = 0;
		evensum = 0; // 짝수 합 초기화
		oddsum = 0; // 홀수 합 초기화

		while (++init <= 20) {
			if (!(init == 3 || init == 7 || init == 9 || init == 13)) {
				if (init % 2 == 0) {
					evensum += init;
				} else {
					oddsum += init;
				}
			}
		}
		System.out.println("2. while문 - 짝수 합 = " + evensum + ", 홀수 합 = " + oddsum);

		// 3. dowhile
		init = 1;
		evensum = 0; // 짝수 합 초기화
		oddsum = 0; // 홀수 합 초기화
		do {
			if (!(init == 3 || init == 7 || init == 9 || init == 13)) {
				if (init % 2 == 0) {
					evensum += init;
				} else {
					oddsum += init;
				}
			}
		} while (++init <= 20);
		System.out.println("3. dowhile문 - 짝수 합 = " + evensum + ", 홀수 합 = " + oddsum);

		
		//ver2
//		int evensum = 0; // 짝수 합
//		int oddsum = 0; // 홀수 합
//		for (int i = 1; i <= 20; i++) {
//				if (i % 2 == 0) {
//					evensum += i;
//				} else {
//					if (i == 3 || i == 7 || i == 9 || i == 13) {
//						oddsum -=i;
//					}
//					oddsum += i;
//				}
//			} 
//		System.out.println("1. For문 - 짝수 합 = " + evensum + ", 홀수 합 = " + oddsum);
//
//		// 2. while
//		int init = 0;
//		evensum = 0; // 짝수 합 초기화
//		oddsum = 0; // 홀수 합 초기화
//
//		while (++init <= 20) { 
//				if (init % 2 == 0) {
//					evensum += init;
//				} else {
//					if (init == 3 || init == 7 || init == 9 || init == 13) {
//						oddsum -= init;
//					}
//					oddsum += init;
//				} 
//		}
//		System.out.println("2. while문 - 짝수 합 = " + evensum + ", 홀수 합 = " + oddsum);
//
//		// 3. dowhile
//		init = 1;
//		evensum = 0; // 짝수 합 초기화
//		oddsum = 0; // 홀수 합 초기화
//		do {
//			if (init % 2 == 0) {
//				evensum += init;
//			} else {
//				if (init == 3 || init == 7 || init == 9 || init == 13) {
//					oddsum -= init;
//				}
//				oddsum += init;
//			} 
//		} while (++init <= 20);
//		System.out.println("3. dowhile문 - 짝수 합 = " + evensum + ", 홀수 합 = " + oddsum);
	}

}
