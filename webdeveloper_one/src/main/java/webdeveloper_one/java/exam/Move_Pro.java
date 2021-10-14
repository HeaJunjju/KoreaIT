package webdeveloper_one.java.exam;

public class Move_Pro {
	public int array[];
	public int sum = 0;
	public int start = 0;

	public void initSum(int start) {
		if (sum != 0) {
			sum = 0;
		}

		if (start != 0) {
			this.start = start;
		}

	}

	public Move_Pro() {

	}

	public Move_Pro(int start, int max) {
		For(start, max);
		While(start, max);
		DoWhile(start, max);
	}

	public void Print() {
		System.out.println("for문 합: " + For(1, 4)); // 2~4까지의 합
		System.out.println("while문 합: " + While(1, 20)); // 2~20까지의 합
		System.out.println("dowhile문 합: " + DoWhile(1, 12)); // 2~12까지의 합
	}

	public int For(int start, int max) {
		initSum(start);

		array = new int[max];
		for (; start < array.length; start++) {
			array[start] = start + 1;
			System.out.println(array[start]);
			sum += array[start];
		}
		return sum;
	}

	public int While(int start, int max) {
		initSum(start);

		array = new int[max];
		while (start < array.length) {
			array[start] = start + 1;
			sum += array[start];
			++start;
		}
		return sum;
	}

	public int DoWhile(int start, int max) {
		initSum(start);

		array = new int[max];
		do {
			array[start] = start + 1;
			sum += array[start];
		} while (++start < array.length);

		return sum;
	}

	public static void main(String[] args) {
		// Move_Pro m = new Move_Pro(2, 20);
		Move_Pro m2 = new Move_Pro();

		m2.Print();

	}

}
