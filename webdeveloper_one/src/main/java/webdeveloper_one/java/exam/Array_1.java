package webdeveloper_one.java.exam;

public class Array_1 {
	public static void main(String[] args) {

		// 배열은 0부터 시작하고, 0부터 접근할 수 있다.
		// index라는 말이 나오면 무조건 0부터 시작하고, 0부터 접근 가능
		// element(요소): 배열의 개수 -> 실제 직무에서는 element라고 해야 함.
		// 1차원 배열 초기화
		int array[] = { 1, 2, 3, 4, 5 };

//		System.out.println(array[0]);
//		System.out.println(array[1]);
//		System.out.println(array[2]);
//		System.out.println(array[3]);
//		System.out.println(array[4]);

		// array.length: element 의 개수, 또는 배열의 개수

		// 1~10의 배열 초기화를 하고, 합을 구하시오
		int sum = 0;
		int array2[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9, 10 };

		for (int i = 0; i < array2.length; i++) {
			sum += array2[i];
		}
		System.out.println("합: " + sum);

		System.out.println("==========================");

		int array3[] = new int[5];
		array3[0] = 1;
		array3[1] = 2;
		array3[2] = 3;
		array3[3] = 4;
		array3[4] = 5;

		for (int i = 0; i < array3.length; i++) {
			System.out.println(array3[i]);
		}

		System.out.println("==========================");
		// 1~20의 합을 구하시오

		int array4[] = new int[20];
		int sum4 = 0;
		for (int i = 0; i < array4.length; i++) {
			array4[i] = i + 1;
			sum4 += array4[i];
		}
		System.out.println("sum4 = " + sum4);
 
	}
}
