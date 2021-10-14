package webdeveloper_one.doitjava;

public class Array_1 {

	public static void main(String[] args) {

		// 초기화
		// 1차원 배열
		// 자바의 배열: 자바의 배열은 같은 타입이 연속적으로 이루어진 모임
		// Object 모든 타입을 담을 수 있다
		// 배열: index 0부터 시작
		int array[] = { 1, 2, 3, 4, 5 };

		for (int i = 0; i < array.length; i++)
			System.out.println(array[i]);

		System.out.println("==========================");

		// 10개의 배열
		int array2[] = new int[10];

		for (int i = 0; i < array2.length; i++) {
			System.out.println(array2[i]);
		}

		System.out.println("==========================");

		// 1~10 합
		int array3[] = new int[10];
		int sum = 0;
		for (int i = 0; i < array3.length; i++) {
			array3[i] = i + 1;
			sum += array3[i];
		}
		System.out.println(sum);

		System.out.println("==========================");

		// while 3, 9를 뺀 합을 출력하시오
		
		  int array4[] = {1,2,3,4,5,6,7,8,9,10};
		  sum = 0; 
		  int i = 0;  
		  while (i < array4.length) { 
			  if (!(array4[i] == 3 || array4[i] == 9)){ 
				  sum += array4[i]; 
			  }
			  i++;
		  } 
		  System.out.println("while 3, 9를 뺀 합: " + sum);
		 
		// do-while 3, 9를 뺀 합을 출력하시오
		int array5[] = {1,2,3,4,5,6,7,8,9,10};
		sum = 0;
		i = 0;
		do {
			if (!(array5[i] == 3 || array5[i] == 9)) {
				sum += array5[i];
			}
		} while (++i < array5.length);
		System.out.println("Dowhile 3, 9를 뺀 합: " + sum);
	}
}
