package webdeveloper_one.java.exam;

public class For_2 {

	public static void main(String[] args) {

		// \t: 5칸 이동
		// \n: 개행(줄바꿈)
		// System.out.print(): 줄바꿈 없이 출력
		// System.out.println(): 출력 후 줄바꿈

		// 구구단 2~9단까지 출력하시오.
//		for (int i = 2; i <= 9; i++) {
//			for (int j = 1; j <= 9; j++) {
//				System.out.print(i + " * " + j + " = " + (i * j) + " ");
//				System.out.print("\t");
//			}
//			System.out.println();
//		}

		// 3,5,7 빼고 출력(줄칸 맞게)
		for (int i = 2; i <= 9; i++) {
			if (!(i == 3 || i == 5 || i == 7)) {
				for (int j = 1; j <= 9; j++) {
					System.out.print(i + " * " + j + " = " + (i * j));
					System.out.print("\t");
				}
				System.out.println();
			}
		}
	}
}
