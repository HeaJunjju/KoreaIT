package webdeveloper_one.doitjava;

public class For_2 {

	public static void main(String[] args) {
//
//		for(int i=1;i<=5;i++) {
//			for(int j=1;j<=5;j++) {
//				System.out.print("행: "+i);
//				System.out.print("\t열: "+j);
//			}			
//		System.out.println();
//		}

		// 구구단
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };

		// for
		System.out.println("-----for구구단-----");
		for (int y : arr) {
			//단
			for (int x : arr) {
				if (!(x == 1 || x == 3 || x == 6 || x == 9))
					System.out.print(x + " x " + y + "=" + y * x + "\t");
			}
			System.out.println();
		}

		// while
		System.out.println("----while구구단----");
		int y = 0, x = 0;
		while (++y <= 9) {
			//단
			while (++x <= 9) {
				if (!(x == 1 || x == 3 || x == 6 || x == 9))
					System.out.print(x + " x " + y + "=" + y * x + "\t");
			}
			x = 0;
			System.out.println();
		}

		// Do-while
		System.out.println("---Dowhile구구단---");

		y = 1;
		x = 1;
		do {
			//단
			do {
				if (!(x == 1 || x == 3 || x == 6 || x == 9))
					System.out.print(x + " x " + y + "=" + y * x + "\t");
			} while (++x <= 9);
			System.out.println();
			x = 1;
		} while (++y <= 9);
		System.out.println();
	}
}