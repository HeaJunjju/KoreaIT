package webdeveloper_one.java;

public class Throwable_1 {

	int Age() throws Exception {
		return 10;
	}

	public static void main(String[] args) {
		Throwable_1 th = new Throwable_1();
		try {
			th.Age();
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
}
