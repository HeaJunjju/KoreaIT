package webdeveloper_one.java;

public class Trycatch_1 {

	public static void main(String[] args) {

		try {
			// 실행하는 곳
			int array[] = { 1, 2, 3, 4, 5 };
			for (int i = 0; i <= array.length; i++) {
				System.out.println(array[i]);
			}

		} catch (IndexOutOfBoundsException e) {
			// Exception: 모든 에러처리의 부모이기 때문에
			// 모든 에러처리는 Exception 받을 수 있다.

			System.out.println("에러나는 곳");
		} catch (RuntimeException e) { // 메모리가 가득 찰 경우 에러 처리
			// TODO: handle exception
		} catch (Exception e) { // 부모이기 때문에 맨 위에 적으면 오류가 남. 맨 아래로 내려야 함.
			// TODO: handle exception
		}
	}
}
