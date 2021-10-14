package webdeveloper_one.doitjava;

public class For_1 {

	public static void main(String[] args) {

		int i = 2;
		int sum = 0;
		for (; i <= 11; i++) {
			System.out.println(i);
			sum += i;
		}
		System.out.println("2~11 sum=" + sum);

		// 3~20 3,8,20 포함한 값 /뺀 값 출력
		int onesum = 0;
		int twosum = 0;

		for (i = 3; i <= 20; ++i) {
			// 뺀 값
			if (!(i == 3 || i == 8 || i == 20)) {
				twosum += i;
			}
			// 포함한 값
			onesum += i;
		}
		System.out.println(onesum + ", " + twosum);
		System.out.println("===============================");

		// 4~20 4,8,13을 빼고 짝수의 합 홀수의 합을 출력
		System.out.println("4~20 4,8,13을 빼고 짝수의 합 홀수의 합을 출력");
		int evensum = 0;
		int oddsum = 0;

		
		for (i = 4; i <= 20; i++) {
			if (!(i == 4 || i == 8 || i == 13)) {
				if (i % 2 == 0) {
					evensum += i;
				} else
					oddsum += i;
			}
		}
		System.out.println("짝수합: " + evensum);
		System.out.println("홀수합: " + oddsum);
	}
}
