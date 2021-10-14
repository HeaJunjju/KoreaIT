package webdeveloper_one.java.exam;

public class Array_new {

	public static void main(String[] args) {
		// 3~21까지 초기화 배열 후 합을 구하시오.
		// 21개 배열을 만들어서 합을 구하기
		// 4, 9, 20 element 를 뺀 합 구하기

		int array[] = new int[18];
		int sum = 0;

		for (int i = 0; i < array.length; i++) {
			array[i] = i + 3;
			if (!(array[i] == 4 || array[i] == 9 || array[i] == 20)) {
				sum += array[i];
			}
		}
		System.out.println("sum : " + sum);
	}

}
