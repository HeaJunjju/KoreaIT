package webdeveloper_one.doitjava;

public class If_1 {

	public static void main(String[] args) {
		int a = 3;
		int b = (a > 5) ? 10 : 20;
		System.out.println("a: " + a + "b: " + b);

		int one = 10;
		int two = 20;

		if (one > two) {
			System.out.println("one>two");
		}
		if (one < two) {
			System.out.println("one<two");
		}
		if (one == two) {
			System.out.println("one==two");
		}
		
	}
}
