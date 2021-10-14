package webdeveloper_one.java;

public class if_1 {

	public static void main(String[] args) {
		// a&&b : a and b가 true면 true, 나머진 false
		// a||b : a or b 중 하나라도 true면 true, 나머진 false

		int a = 10;
		int b = 20;

		if (a == 10 || b == 30) {
			System.out.println("true이다.");
		} else {
			System.out.println("false이다.");
		}

		a = 20;
		b = 30;

		if ((a < b) && (a == b)) {
			System.out.println("true");
		} else {
			System.out.println("fasle");
		}
	}
}
