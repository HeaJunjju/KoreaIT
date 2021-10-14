package webdeveloper_one.doitjava;

public class Static_1 {

	private static int init=0;

	public static void main(String[] args) {
		Static_1 stat= new Static_1();
		
		for (int i = 1; i <=5; i++) {
			//System.out.println(++new Static_1().init);
			System.out.println(++Static_1.init);
		}
	}
}
