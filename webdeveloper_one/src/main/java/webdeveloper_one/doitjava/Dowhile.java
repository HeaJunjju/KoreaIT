package webdeveloper_one.doitjava;

public class Dowhile {

	public static void main(String[] args) {

		//do{실행하고 조건문에 해당하지 않으면 종료}while(조건문);
		int init=1;
		int sum=0;
		do {
			sum+=init;
			System.out.println(init);
		}while(++init<=10);
		System.out.println(sum);
	}

}
