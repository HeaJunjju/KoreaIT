package webdeveloper_one.java.exam;

public class Array_2 {

	public static void main(String[] args) {
		// 2차원 배열 초기화: 행과 열로 이루어진다.

//		int array[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
//
//		for (int i = 0; i < array.length; i++) {
//			for (int j = 0; j < array.length; j++) {
//				System.out.print("\t " + array[i][j]);
//			}
//			System.out.println();
//		}

		// 0~8 3행 3열로 만들고 합을 출력하시오.
		int array[][] = new int[3][3];
		int sum = 0;
		int a = 0;
		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				array[i][j] = a++;
				sum += array[i][j];
			}
		}

		System.out.println("총 sum = " + sum + "\n");

		System.out.println("==================");
		// 1) 3,6,8을 뺀 합을 출력
		int array2[][] = new int[3][3];
		int sum2 = 0;
		int b = 0;

		for (int i = 0; i < array2.length; i++) {
			for (int j = 0; j < array2[i].length; j++) {
				array2[i][j] = b++;
				if (!(array2[i][j] == 3 || array2[i][j] == 6 || array2[i][j] == 8)) {
					sum2 += array2[i][j];
				}
			}
		}
		System.out.println("1) 3,6,8을 뺀 합을 출력 -> sum = " + sum2);

		// 2) 짝수의 합 출력
		int array3[][] = new int[3][3];
		int sum3 = 0;
		int c = 0;

		for (int i = 0; i < array3.length; i++) {
			for (int j = 0; j < array3[i].length; j++) {
				array3[i][j] = c++;
				if (array3[i][j] % 2 == 0) {
					sum3 += array3[i][j];
				}
			}
		}
		System.out.println("2) 짝수의 합 출력 -> sum = " + sum3);

		// 4) 홀수의 합 출력
		int array4[][] = new int[3][3];
		int sum4 = 0;
		int d = 0;

		for (int i = 0; i < array4.length; i++) {
			for (int j = 0; j < array4[i].length; j++) {
				array4[i][j] = d++;
				if (array4[i][j] % 2 != 0) {
					sum4 += array4[i][j];
				}
			}
		}
		System.out.println("3) 홀수의 합 출력 -> sum = " + sum4);
	}

}
